/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.extension.siddhi.io.websocket.sink.util;

import org.wso2.transport.http.netty.contract.HttpWsConnectorFactory;
import org.wso2.transport.http.netty.contract.websocket.ClientHandshakeFuture;
import org.wso2.transport.http.netty.contract.websocket.WebSocketClientConnector;
import org.wso2.transport.http.netty.contract.websocket.WebSocketClientConnectorConfig;
import org.wso2.transport.http.netty.contractimpl.DefaultHttpWsConnectorFactory;

public class WebSocketReceiver {

    public WebSocketReceiver(String url, ResultContainer resultContainer) {
        HttpWsConnectorFactory httpConnectorFactory = new DefaultHttpWsConnectorFactory();
        WebSocketClientConnectorConfig configuration = new WebSocketClientConnectorConfig(url);
        configuration.setAutoRead(true);
        WebSocketClientConnector clientConnector = httpConnectorFactory.createWsClientConnector(configuration);
        WebSocketClientConnectorListener connectorListener = new WebSocketClientConnectorListener();
        ClientHandshakeFuture clientHandshakeFuture = clientConnector.connect();
        clientHandshakeFuture.setWebSocketConnectorListener(connectorListener);

        WebSocketHandshakeListener handshakeListener = new WebSocketHandshakeListener
                (connectorListener, resultContainer);
        clientHandshakeFuture.setClientHandshakeListener(handshakeListener);
    }

}