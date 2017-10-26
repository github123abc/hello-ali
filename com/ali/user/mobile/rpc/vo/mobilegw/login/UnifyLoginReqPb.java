package com.ali.user.mobile.rpc.vo.mobilegw.login;

import java.util.Collections;
import java.util.List;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UnifyLoginReqPb extends Message
{
	public static final String DEFAULT_ACCESSPOINT = "";
	public static final String DEFAULT_ALIPAYENVJSON = "";
	public static final String DEFAULT_APDID = "";
	public static List DEFAULT_APPDATA = null;
	public static final String DEFAULT_APPID = "";
	public static final String DEFAULT_APPKEY = "";
	public static final String DEFAULT_CELLID = "";
	public static final String DEFAULT_CHANNEL = "";
	public static final String DEFAULT_CHECKCODE = "";
	public static final String DEFAULT_CHECKCODEID = "";
	public static final String DEFAULT_CLIENTPOSTION = "";
	public static final String DEFAULT_CLIENTTYPE = "";
	public static final String DEFAULT_DEVICEID = "";
	public static List DEFAULT_EXTERNPARAMS = null;
	public static final String DEFAULT_IMEI = "";
	public static final String DEFAULT_IMSI = "";
	public static final String DEFAULT_ISPRISONBREAK = "";
	public static final String DEFAULT_LACID = "";
	public static final String DEFAULT_LOGINID = "";
	public static final String DEFAULT_LOGINPWD = "";
	public static LoginType DEFAULT_LOGINTYPE = null;
	public static final String DEFAULT_MOBILEBRAND = "";
	public static final String DEFAULT_MOBILEMODEL = "";
	public static final String DEFAULT_PRODUCTID = "";
	public static final String DEFAULT_PRODUCTVERSION = "";
	public static final String DEFAULT_SCENE = "";
	public static Integer DEFAULT_SCREENHIGH = null;
	public static Integer DEFAULT_SCREENWIDTH = null;
	public static final String DEFAULT_SDKVERSION = "";
	public static final String DEFAULT_SIGNDATA = "";
	public static final String DEFAULT_SSOTOKEN = "";
	public static final String DEFAULT_SYSTEMTYPE = "";
	public static final String DEFAULT_SYSTEMVERSION = "";
	public static final String DEFAULT_TAOBAOENVJSON = "";
	public static final String DEFAULT_TID = "";
	public static final String DEFAULT_TOKEN = "";
	public static final String DEFAULT_TTID = "";
	public static final String DEFAULT_UMIDTOKEN = "";
	public static final String DEFAULT_USERAGENT = "";
	public static final String DEFAULT_UTDID = "";
	public static LoginWthPwd DEFAULT_VALIDATETPYE = null;
	public static final String DEFAULT_WIFIMAC = "";
	public static final String DEFAULT_WIFINODENAME = "";
	public static final int TAG_ACCESSPOINT = 28;
	public static final int TAG_ALIPAYENVJSON = 37;
	public static final int TAG_APDID = 12;
	public static final int TAG_APPDATA = 41;
	public static final int TAG_APPID = 2;
	public static final int TAG_APPKEY = 3;
	public static final int TAG_CELLID = 35;
	public static final int TAG_CHANNEL = 21;
	public static final int TAG_CHECKCODE = 11;
	public static final int TAG_CHECKCODEID = 10;
	public static final int TAG_CLIENTPOSTION = 29;
	public static final int TAG_CLIENTTYPE = 22;
	public static final int TAG_DEVICEID = 40;
	public static final int TAG_EXTERNPARAMS = 42;
	public static final int TAG_IMEI = 20;
	public static final int TAG_IMSI = 19;
	public static final int TAG_ISPRISONBREAK = 36;
	public static final int TAG_LACID = 34;
	public static final int TAG_LOGINID = 1;
	public static final int TAG_LOGINPWD = 7;
	public static final int TAG_LOGINTYPE = 4;
	public static final int TAG_MOBILEBRAND = 26;
	public static final int TAG_MOBILEMODEL = 27;
	public static final int TAG_PRODUCTID = 16;
	public static final int TAG_PRODUCTVERSION = 17;
	public static final int TAG_SCENE = 6;
	public static final int TAG_SCREENHIGH = 25;
	public static final int TAG_SCREENWIDTH = 24;
	public static final int TAG_SDKVERSION = 43;
	public static final int TAG_SIGNDATA = 9;
	public static final int TAG_SSOTOKEN = 8;
	public static final int TAG_SYSTEMTYPE = 30;
	public static final int TAG_SYSTEMVERSION = 31;
	public static final int TAG_TAOBAOENVJSON = 38;
	public static final int TAG_TID = 14;
	public static final int TAG_TOKEN = 39;
	public static final int TAG_TTID = 15;
	public static final int TAG_UMIDTOKEN = 18;
	public static final int TAG_USERAGENT = 23;
	public static final int TAG_UTDID = 13;
	public static final int TAG_VALIDATETPYE = 5;
	public static final int TAG_WIFIMAC = 32;
	public static final int TAG_WIFINODENAME = 33;
	@ProtoField(tag=28, type=Message.Datatype.STRING) public String accessPoint;
	@ProtoField(tag=37, type=Message.Datatype.STRING) public String alipayEnvJson;
	@ProtoField(tag=12, type=Message.Datatype.STRING) public String apdid;
	@ProtoField(label=Message.Label.REPEATED, tag=41) public List appData;
	@ProtoField(tag=2, type=Message.Datatype.STRING) public String appId;
	@ProtoField(tag=3, type=Message.Datatype.STRING) public String appKey;
	@ProtoField(tag=35, type=Message.Datatype.STRING) public String cellId;
	@ProtoField(tag=21, type=Message.Datatype.STRING) public String channel;
	@ProtoField(tag=11, type=Message.Datatype.STRING) public String checkCode;
	@ProtoField(tag=10, type=Message.Datatype.STRING) public String checkCodeId;
	@ProtoField(tag=29, type=Message.Datatype.STRING) public String clientPostion;
	@ProtoField(tag=22, type=Message.Datatype.STRING) public String clientType;
	@ProtoField(tag=40, type=Message.Datatype.STRING) public String deviceId;
	@ProtoField(label=Message.Label.REPEATED, tag=42) public List externParams;
	@ProtoField(tag=20, type=Message.Datatype.STRING) public String imei;
	@ProtoField(tag=19, type=Message.Datatype.STRING) public String imsi;
	@ProtoField(tag=36, type=Message.Datatype.STRING) public String isPrisonBreak;
	@ProtoField(tag=34, type=Message.Datatype.STRING) public String lacId;
	@ProtoField(tag=1, type=Message.Datatype.STRING) public String loginId;
	@ProtoField(tag=7, type=Message.Datatype.STRING) public String loginPwd;
	@ProtoField(tag=4, type=Message.Datatype.ENUM) public LoginType loginType;
	@ProtoField(tag=26, type=Message.Datatype.STRING) public String mobileBrand;
	@ProtoField(tag=27, type=Message.Datatype.STRING) public String mobileModel;
	@ProtoField(tag=16, type=Message.Datatype.STRING) public String productId;
	@ProtoField(tag=17, type=Message.Datatype.STRING) public String productVersion;
	@ProtoField(tag=6, type=Message.Datatype.STRING) public String scene;
	@ProtoField(tag=25, type=Message.Datatype.INT32) public Integer screenHigh;
	@ProtoField(tag=24, type=Message.Datatype.INT32) public Integer screenWidth;
	@ProtoField(tag=43, type=Message.Datatype.STRING) public String sdkVersion;
	@ProtoField(tag=9, type=Message.Datatype.STRING) public String signData;
	@ProtoField(tag=8, type=Message.Datatype.STRING) public String ssoToken;
	@ProtoField(tag=30, type=Message.Datatype.STRING) public String systemType;
	@ProtoField(tag=31, type=Message.Datatype.STRING) public String systemVersion;
	@ProtoField(tag=38, type=Message.Datatype.STRING) public String taobaoEnvJson;
	@ProtoField(tag=14, type=Message.Datatype.STRING) public String tid;
	@ProtoField(tag=39, type=Message.Datatype.STRING) public String token;
	@ProtoField(tag=15, type=Message.Datatype.STRING) public String ttid;
	@ProtoField(tag=18, type=Message.Datatype.STRING) public String umidToken;
	@ProtoField(tag=23, type=Message.Datatype.STRING) public String userAgent;
	@ProtoField(tag=13, type=Message.Datatype.STRING) public String utdid;
	@ProtoField(tag=5, type=Message.Datatype.ENUM) public LoginWthPwd validateTpye;
	@ProtoField(tag=32, type=Message.Datatype.STRING) public String wifiMac;
	@ProtoField(tag=33, type=Message.Datatype.STRING) public String wifiNodeName;

	static {
		UnifyLoginReqPb.DEFAULT_LOGINTYPE = LoginType.alipay;
		UnifyLoginReqPb.DEFAULT_VALIDATETPYE = LoginWthPwd.withpwd;
		UnifyLoginReqPb.DEFAULT_SCREENWIDTH = Integer.valueOf(0);
		UnifyLoginReqPb.DEFAULT_SCREENHIGH = Integer.valueOf(0);
		UnifyLoginReqPb.DEFAULT_APPDATA = Collections.emptyList();
		UnifyLoginReqPb.DEFAULT_EXTERNPARAMS = Collections.emptyList();
	}

	public UnifyLoginReqPb() {
		super();
	}

	public UnifyLoginReqPb(UnifyLoginReqPb arg2) {
		 //super(arg2);
		if(arg2 != null) {
			this.loginId = arg2.loginId;
			this.appId = arg2.appId;
			this.appKey = arg2.appKey;
			this.loginType = arg2.loginType;
			this.validateTpye = arg2.validateTpye;
			this.scene = arg2.scene;
			this.loginPwd = arg2.loginPwd;
			this.ssoToken = arg2.ssoToken;
			this.signData = arg2.signData;
			this.checkCodeId = arg2.checkCodeId;
			this.checkCode = arg2.checkCode;
			this.apdid = arg2.apdid;
			this.utdid = arg2.utdid;
			this.tid = arg2.tid;
			this.ttid = arg2.ttid;
			this.productId = arg2.productId;
			this.productVersion = arg2.productVersion;
			this.umidToken = arg2.umidToken;
			this.imsi = arg2.imsi;
			this.imei = arg2.imei;
			this.channel = arg2.channel;
			this.clientType = arg2.clientType;
			this.userAgent = arg2.userAgent;
			this.screenWidth = arg2.screenWidth;
			this.screenHigh = arg2.screenHigh;
			this.mobileBrand = arg2.mobileBrand;
			this.mobileModel = arg2.mobileModel;
			this.accessPoint = arg2.accessPoint;
			this.clientPostion = arg2.clientPostion;
			this.systemType = arg2.systemType;
			this.systemVersion = arg2.systemVersion;
			this.wifiMac = arg2.wifiMac;
			this.wifiNodeName = arg2.wifiNodeName;
			this.lacId = arg2.lacId;
			this.cellId = arg2.cellId;
			this.isPrisonBreak = arg2.isPrisonBreak;
			this.alipayEnvJson = arg2.alipayEnvJson;
			this.taobaoEnvJson = arg2.taobaoEnvJson;
			this.token = arg2.token;
			this.deviceId = arg2.deviceId;
			this.appData = UnifyLoginReqPb.copyOf(arg2.appData);
			this.externParams = UnifyLoginReqPb.copyOf(arg2.externParams);
			this.sdkVersion = arg2.sdkVersion;
		}
	}

	public final boolean equals(Object arg5) {
		boolean v0 = true;
		if((((UnifyLoginReqPb)arg5)) != this) {
			if(!(arg5 instanceof UnifyLoginReqPb)) {
				v0 = false;
			}
			else {
				if((this.equals(this.loginId, ((UnifyLoginReqPb)arg5).loginId)) && (this.equals(this
						.appId, ((UnifyLoginReqPb)arg5).appId)) && (this.equals(this.appKey, ((UnifyLoginReqPb)
								arg5).appKey)) && (this.equals(this.loginType, ((UnifyLoginReqPb)arg5).loginType))
								&& (this.equals(this.validateTpye, ((UnifyLoginReqPb)arg5).validateTpye)) && (
										this.equals(this.scene, ((UnifyLoginReqPb)arg5).scene)) && (this.equals(this
												.loginPwd, ((UnifyLoginReqPb)arg5).loginPwd)) && (this.equals(this.ssoToken, ((
														UnifyLoginReqPb)arg5).ssoToken)) && (this.equals(this.signData, ((UnifyLoginReqPb)
																arg5).signData)) && (this.equals(this.checkCodeId, ((UnifyLoginReqPb)arg5).checkCodeId))
																&& (this.equals(this.checkCode, ((UnifyLoginReqPb)arg5).checkCode)) && (this
																		.equals(this.apdid, ((UnifyLoginReqPb)arg5).apdid)) && (this.equals(this.utdid, ((
																				UnifyLoginReqPb)arg5).utdid)) && (this.equals(this.tid, ((UnifyLoginReqPb)arg5)
																						.tid)) && (this.equals(this.ttid, ((UnifyLoginReqPb)arg5).ttid)) && (this.equals(
																								this.productId, ((UnifyLoginReqPb)arg5).productId)) && (this.equals(this.productVersion, ((
																										UnifyLoginReqPb)arg5).productVersion)) && (this.equals(this.umidToken, ((UnifyLoginReqPb)
																												arg5).umidToken)) && (this.equals(this.imsi, ((UnifyLoginReqPb)arg5).imsi)) && (
																														this.equals(this.imei, ((UnifyLoginReqPb)arg5).imei)) && (this.equals(this.channel, ((
																																UnifyLoginReqPb)arg5).channel)) && (this.equals(this.clientType, ((UnifyLoginReqPb)
																																		arg5).clientType)) && (this.equals(this.userAgent, ((UnifyLoginReqPb)arg5).userAgent))
																																		&& (this.equals(this.screenWidth, ((UnifyLoginReqPb)arg5).screenWidth)) && (
																																				this.equals(this.screenHigh, ((UnifyLoginReqPb)arg5).screenHigh)) && (this.equals(
																																						this.mobileBrand, ((UnifyLoginReqPb)arg5).mobileBrand)) && (this.equals(this
																																								.mobileModel, ((UnifyLoginReqPb)arg5).mobileModel)) && (this.equals(this.accessPoint, ((
																																										UnifyLoginReqPb)arg5).accessPoint)) && (this.equals(this.clientPostion, ((UnifyLoginReqPb)
																																												arg5).clientPostion)) && (this.equals(this.systemType, ((UnifyLoginReqPb)arg5)
																																														.systemType)) && (this.equals(this.systemVersion, ((UnifyLoginReqPb)arg5).systemVersion))
																																														&& (this.equals(this.wifiMac, ((UnifyLoginReqPb)arg5).wifiMac)) && (this.equals(
																																																this.wifiNodeName, ((UnifyLoginReqPb)arg5).wifiNodeName)) && (this.equals(this
																																																		.lacId, ((UnifyLoginReqPb)arg5).lacId)) && (this.equals(this.cellId, ((UnifyLoginReqPb)
																																																				arg5).cellId)) && (this.equals(this.isPrisonBreak, ((UnifyLoginReqPb)arg5).isPrisonBreak))
																																																				&& (this.equals(this.alipayEnvJson, ((UnifyLoginReqPb)arg5).alipayEnvJson))
																																																				&& (this.equals(this.taobaoEnvJson, ((UnifyLoginReqPb)arg5).taobaoEnvJson))
																																																				&& (this.equals(this.token, ((UnifyLoginReqPb)arg5).token)) && (this.equals(
																																																						this.deviceId, ((UnifyLoginReqPb)arg5).deviceId)) && (this.equals(this.appData, ((
																																																								UnifyLoginReqPb)arg5).appData)) && (this.equals(this.externParams, ((UnifyLoginReqPb)
																																																										arg5).externParams)) && (this.equals(this.sdkVersion, ((UnifyLoginReqPb)arg5)
																																																												.sdkVersion))) {
					return v0;
				}

				v0 = false;
			}
		}

		return v0;
	}


	public final UnifyLoginReqPb fillTagValue(int arg2, Object arg3) {
		switch(arg2) {
			case 1: {
				this.loginId = ((String)arg3);
				break;
			}
			case 2: {
				this.appId = ((String)arg3);
				break;
			}
			case 3: {
				this.appKey = ((String)arg3);
				break;
			}
			case 4: {
				this.loginType = ((LoginType)arg3);
				break;
			}
			case 5: {
				this.validateTpye = ((LoginWthPwd)arg3);
				break;
			}
			case 6: {
				this.scene = ((String)arg3);
				break;
			}
			case 7: {
				this.loginPwd = ((String)arg3);
				break;
			}
			case 8: {
				this.ssoToken = ((String)arg3);
				break;
			}
			case 9: {
				this.signData = ((String)arg3);
				break;
			}
			case 10: {
				this.checkCodeId = ((String)arg3);
				break;
			}
			case 11: {
				this.checkCode = ((String)arg3);
				break;
			}
			case 12: {
				this.apdid = ((String)arg3);
				break;
			}
			case 13: {
				this.utdid = ((String)arg3);
				break;
			}
			case 14: {
				this.tid = ((String)arg3);
				break;
			}
			case 15: {
				this.ttid = ((String)arg3);
				break;
			}
			case 16: {
				this.productId = ((String)arg3);
				break;
			}
			case 17: {
				this.productVersion = ((String)arg3);
				break;
			}
			case 18: {
				this.umidToken = ((String)arg3);
				break;
			}
			case 19: {
				this.imsi = ((String)arg3);
				break;
			}
			case 20: {
				this.imei = ((String)arg3);
				break;
			}
			case 21: {
				this.channel = ((String)arg3);
				break;
			}
			case 22: {
				this.clientType = ((String)arg3);
				break;
			}
			case 23: {
				this.userAgent = ((String)arg3);
				break;
			}
			case 24: {
				this.screenWidth = ((Integer)arg3);
				break;
			}
			case 25: {
				this.screenHigh = ((Integer)arg3);
				break;
			}
			case 26: {
				this.mobileBrand = ((String)arg3);
				break;
			}
			case 27: {
				this.mobileModel = ((String)arg3);
				break;
			}
			case 28: {
				this.accessPoint = ((String)arg3);
				break;
			}
			case 29: {
				this.clientPostion = ((String)arg3);
				break;
			}
			case 30: {
				this.systemType = ((String)arg3);
				break;
			}
			case 31: {
				this.systemVersion = ((String)arg3);
				break;
			}
			case 32: {
				this.wifiMac = ((String)arg3);
				break;
			}
			case 33: {
				this.wifiNodeName = ((String)arg3);
				break;
			}
			case 34: {
				this.lacId = ((String)arg3);
				break;
			}
			case 35: {
				this.cellId = ((String)arg3);
				break;
			}
			case 36: {
				this.isPrisonBreak = ((String)arg3);
				break;
			}
			case 37: {
				this.alipayEnvJson = ((String)arg3);
				break;
			}
			case 38: {
				this.taobaoEnvJson = ((String)arg3);
				break;
			}
			case 39: {
				this.token = ((String)arg3);
				break;
			}
			case 40: {
				this.deviceId = ((String)arg3);
				break;
			}
			case 41: {
				this.appData = UnifyLoginReqPb.immutableCopyOf(((List)arg3));
				break;
			}
			case 42: {
				this.externParams = UnifyLoginReqPb.immutableCopyOf(((List)arg3));
				break;
			}
			case 43: {
				this.sdkVersion = ((String)arg3);
				break;
			}
		}

		return this;
	}

	public final int hashCode() {
		int v2 = 1;
		int v1 = 0;
		int v0 = this.hashCode;
		if(v0 == 0) {
			v0 = this.loginId != null ? this.loginId.hashCode() : 0;
			int v3 = v0 * 37;
			v0 = this.appId != null ? this.appId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.appKey != null ? this.appKey.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.loginType != null ? this.loginType.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.validateTpye != null ? this.validateTpye.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.scene != null ? this.scene.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.loginPwd != null ? this.loginPwd.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.ssoToken != null ? this.ssoToken.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.signData != null ? this.signData.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.checkCodeId != null ? this.checkCodeId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.checkCode != null ? this.checkCode.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.apdid != null ? this.apdid.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.utdid != null ? this.utdid.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.tid != null ? this.tid.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.ttid != null ? this.ttid.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.productId != null ? this.productId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.productVersion != null ? this.productVersion.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.umidToken != null ? this.umidToken.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.imsi != null ? this.imsi.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.imei != null ? this.imei.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.channel != null ? this.channel.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.clientType != null ? this.clientType.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.userAgent != null ? this.userAgent.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.screenWidth != null ? this.screenWidth.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.screenHigh != null ? this.screenHigh.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.mobileBrand != null ? this.mobileBrand.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.mobileModel != null ? this.mobileModel.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.accessPoint != null ? this.accessPoint.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.clientPostion != null ? this.clientPostion.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.systemType != null ? this.systemType.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.systemVersion != null ? this.systemVersion.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.wifiMac != null ? this.wifiMac.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.wifiNodeName != null ? this.wifiNodeName.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.lacId != null ? this.lacId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.cellId != null ? this.cellId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.isPrisonBreak != null ? this.isPrisonBreak.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.alipayEnvJson != null ? this.alipayEnvJson.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.taobaoEnvJson != null ? this.taobaoEnvJson.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.token != null ? this.token.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.deviceId != null ? this.deviceId.hashCode() : 0;
			v3 = (v0 + v3) * 37;
			v0 = this.appData != null ? this.appData.hashCode() : 1;
			v0 = (v0 + v3) * 37;
			if(this.externParams != null) {
				v2 = this.externParams.hashCode();
			}

			v0 = (v0 + v2) * 37;
			if(this.sdkVersion != null) {
				v1 = this.sdkVersion.hashCode();
			}

			v0 += v1;
			this.hashCode = v0;
		}

		return v0;
	}

}
