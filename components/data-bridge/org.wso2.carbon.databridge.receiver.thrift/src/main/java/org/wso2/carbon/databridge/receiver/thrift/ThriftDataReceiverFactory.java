/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.databridge.receiver.thrift;

import org.wso2.carbon.databridge.core.DataBridgeReceiverService;
import org.wso2.carbon.databridge.receiver.thrift.conf.ThriftDataReceiverConfiguration;
import org.wso2.carbon.databridge.receiver.thrift.internal.ThriftDataReceiver;

/**
 * The falconry method that is used to create Agent server
 */
public class ThriftDataReceiverFactory {
    public ThriftDataReceiver createAgentServer(
            ThriftDataReceiverConfiguration thriftDataReceiverConfiguration,
            DataBridgeReceiverService dataBridgeReceiverService) {
        return new ThriftDataReceiver(thriftDataReceiverConfiguration, dataBridgeReceiverService);
    }

    public ThriftDataReceiver createAgentServer(int secureReceiverPort, int receiverPort,
                                                DataBridgeReceiverService dataBridgeReceiverService) {
        return new ThriftDataReceiver(secureReceiverPort, receiverPort, dataBridgeReceiverService);
    }


    public ThriftDataReceiver createAgentServer(int receiverPort,
                                                DataBridgeReceiverService dataBridgeReceiverService) {
        return new ThriftDataReceiver(receiverPort, dataBridgeReceiverService);
    }

}
