package com.alipay.mobile.common.transport.config;

import com.alipay.mobile.common.utils.config.ConfigureCtrlManagerImpl;

public class TransportConfigureManager  extends ConfigureCtrlManagerImpl
{
	public static TransportConfigureManager transportConfigureManager;

	public static final TransportConfigureManager getInstance() {
		TransportConfigureManager v0;
		if(TransportConfigureManager.transportConfigureManager != null) {
			v0 = TransportConfigureManager.transportConfigureManager;
		}
		else {
			Class v1 = TransportConfigureManager.class;
			synchronized(v1){
				try {
					if(TransportConfigureManager.transportConfigureManager != null) {
						v0 = TransportConfigureManager.transportConfigureManager;
						//__monitor_exit(v1);
					}
					else {
						TransportConfigureManager.transportConfigureManager = new TransportConfigureManager();
						//__monitor_exit(v1);
						return TransportConfigureManager.transportConfigureManager;
						//label_12:
						//	__monitor_exit(v1);
						//throw new Exception();
					}

					return v0;
				}
				catch(Throwable v0_1) {

				}

				v0 = TransportConfigureManager.transportConfigureManager;
			}
		}

		return v0;
	}

}
