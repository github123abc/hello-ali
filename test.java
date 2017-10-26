import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.ali.user.mobile.rpc.vo.mobilegw.login.LoginType;
import com.ali.user.mobile.rpc.vo.mobilegw.login.LoginWthPwd;
import com.ali.user.mobile.rpc.vo.mobilegw.login.UnifyLoginReqPb;
import com.alipay.mobileapp.biz.rpc.unifylogin.vo.ExternParams;
import com.squareup.wire.Message;
import com.sun.org.apache.regexp.internal.recompile;



public class test
{
	public static void main(String[] args) throws ClientProtocolException, IOException
		
	{	
		UnifyLoginReqPb pb = ReqPb_init(); 


		byte[] b=((Message)pb).toByteArray();
		String url="https://mobilegw.alipay.com/mgw.htm";

		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("visibleflag", "1");
		httpPost.addHeader("Version", "2");
		httpPost.addHeader("AppId", "Android-container");
		httpPost.addHeader("Did", "Wc4EK94PP4EDAD8cdrJrHvmx");
		httpPost.addHeader("AppId", "Android-container");
		httpPost.addHeader("Operation-Type", "ali.user.gw.unifyLogin.pb");
		httpPost.addHeader("Ts", "LxHVuxq");
		httpPost.addHeader("Content-Type", "application/protobuf");
		httpPost.addHeader("Sign", "8b01e141f20465a80152064b4cef4e33");
		httpPost.addHeader("signType", "0");
		httpPost.addHeader("clientVersion", "10.1.2.091816");
		ByteArrayEntity entity = new ByteArrayEntity("内容".getBytes());
		httpPost.setEntity(entity);
		CloseableHttpResponse re = client.execute(httpPost);
		HttpEntity reentity = re.getEntity();
		String s = EntityUtils.toString(reentity);
		System.out.println(s);
		

	}

	private static UnifyLoginReqPb ReqPb_init()
	{
		UnifyLoginReqPb pb=new UnifyLoginReqPb();
		pb.loginId="7777777"; 
		pb.appId="ALIPAY"; 
		pb.appKey="12501616"; 
		pb.loginType=LoginType.alipay; 
		pb.validateTpye=LoginWthPwd.withsndpwd; 
		pb.loginPwd="Nau+S3wu+m1eDGqubcRkocG5w7EL5i9fi0RUEFpQ0gYoU7NSlWIypTXSM10qEP9jlkoWS95GyKKFIMUS8w9+4DI5FQXUdK4Fa0UAGrRiRlsPOY8hveO+2Mk5aKTUesnGC46fvyuEyJGV7pAzfZNMrhctr/r8J7IePOGx/6+MdBM="; 
		pb.apdid="eYOIkhdSYgLVbrrMfqLBPU92e09uvB0toIUNhT9x51cYgdnxM4mbCPJD"; 
		pb.utdid="Wc4EK94PP4EDAD8cdrJrHvmx";   //com.alipay.apmobilesecuritysdk.commonbiz.external.UtdidWrapper;->public static String getUtdid(Context arg7)  似乎会用生成的固定值  阿里官方包
		pb.tid="b8e7ac0fd5e4f9d144a13d0cb344511c48394210b7377ead0a0d468beafd9696"; 
		pb.ttid="b8e7ac0fd5e4f9d144a13d0cb344511c48394210b7377ead0a0d468beafd9696"; 
		pb.productId="Android-container"; 
		pb.productVersion="10.1.2.091816"; 
		pb.umidToken="nn6SwkSqz/NHldIzh3NfXBIq4M/eJH8n"; 
		pb.imsi="170929082827409"; 
		pb.imei="352584066241750"; 
		pb.channel="5135"; 
		pb.clientType="android"; 
		pb.userAgent="LGENexus 5"; 
		pb.	screenWidth=1080; 
		pb.screenHigh=1776;
		pb.mobileBrand="google"; 
		pb.mobileModel="Nexus 5"; 
		pb.clientPostion=""; 
		pb.systemType="android"; 
		pb.systemVersion="4.4"; 
		pb.wifiMac="cc:fa:00:cb:21:70"; 
		pb.wifiNodeName="weibo"; 
		pb.isPrisonBreak="false";
		pb.alipayEnvJson="{\"data\":\"211f2d8470936F90706F6F6C6BE6F8269DC6A8D92D1FFA573D201C723D190168A4FEC79B570C14612DE0A69DEB832FF67DAA1023632201C9A94384CA2BFDAE75C3108FAF2702631173461B91776273A9791087A5F28C819502EED4EC8617625446223183F032D3C13C846C2643CCD3EBC06B6141DC3EDDDE790A665AE7A92A4395BD400B8D76FEBCCF5649D37304DB24FA0327E3658FAA5702B20FE38B9EBEFC164ED297A3CE46878C6C5654A829E2C4995B18D705AAAFCDF4ADDD8AD23E45579E780C0C9D6892F5885F66E15B945A1A887E8B4BF0E4AF2DE6808957262752E1CA489C7C1EB7262EB4B9F15A7F2C0496B12616F06D22936BCCE0ACE40D7CB30757ADA185C73BA985CC53E7B619E421B45655BC3AD450B740FE54DF74599D0DDE5682135594CAA7237D905DF52795BC30608794DBB40171C0FF4292E3EF5A22C57BBAD2F105E0023F17E06D719DF26D44C1D4773E7EAE2F4EBA97C87CFFA0B689823122CDC408536F54AA545480C0584D818EEC5756E69D912CC0DEE15E87B6B653841F5923D0A04D7B478F6127156699266FAD9FF185BAE9E6345FDE5150BE674C18DDB44727B5ADB2135005C65870400FC16864B2F553C55871CBBF44FF9F3565D74B6B850F9B8303AAC51EAB136701385221DF5ACD60B28710428E728F17E546DE1817A4E2ED5C52881D967D71772F37969AE9161897B17CF0C38C6EEFBC0DFBDBFB5DD23E7D6ECDD6B0135C3BAA1A6F2648AF777AF5AEC151958889491C5182D1869CF919CE5AF4D4EB4EFDC00C5FBBE0B2259B669BAEC658FD1F9A775D451E4025DD547B235CC8AEC4FE6FEBE9A9AABEA380936D4F8045053F53CCCABD71A7CA11D503A908EB7BCCDEF5FFE97CCC140084DADCE4157577FA2FC784A8C4940957883759F268BA85311910AA48B46F787D5FDE7FE28135DC7D7A3994B62D597F122240B43C6F7693B76F0C2AFCA935B66881B3D29A72568F9F91FE9CB4FA72BE1C2D3AE134DA772C818651599EF46A5C9D7CE6C7CE8C1EBB4BE61BCB487A217D08853F54DA7EBEB06C0F1E529A8DC043D8F52FCCCAB1BB543548C4B26EC2B88187F50A92EDA798D1BD79B0DA2BD3F1C5739CDCE9E15B76F515C42DAC16BCFE09AF9AA3F826E8F0B6D382AB08D2616AB793FDC404F7EACC8F751E89145DDCB9B6C00C0255ECB036F0B326323598C2B19F25CFD15E5F23AF594C1676463D4AB3CE1E8E9F8C0A22DCBB6370D29CC551A6B6DD28D9FA25C7C8F45EC8439160562CC560FDD6C7EB012C7AB3071678D18ACC749A7121DC6F869F82A5ACA5D82F71F5760E7985BBB94CB99DE615851FB810A7FB7545675594A974149B648DFFDB4D4162A0234D\",\"version\":\"4\"}";
		pb.deviceId="170929082827409|352584066241750";
		
		List<ExternParams> list=new ArrayList<ExternParams>();
		list.add(new ExternParams("mspTid","b8e7ac0fd5e4f9d144a13d0cb344511c48394210b7377ead0a0d468beafd9696"));
		list.add(new ExternParams("terminalName","LGENexus 5"));
		list.add(new ExternParams("mspImei","352584066241750"));
		list.add(new ExternParams("vimsi","15eccc05f4c9139"));
		list.add(new ExternParams("mspImsi","000000000000000"));
		list.add(new ExternParams("clientId","170929082827409|352584066241750"));
		pb.appData=list;
		
		List<ExternParams> list1=new ArrayList<ExternParams>();
		list.add(new ExternParams("devKeySet","{\"apdidToken\":\"BgJ0UDw4iPNUWUTHvAT+o5OK+2kjUaJGws2tqrLa1QsXkiP\\/XgEAAA==\"}"));
		list.add(new ExternParams("apdidDowngrade","N"));
		list.add(new ExternParams("netType","wifi"));
		list.add(new ExternParams("afterLoginSyncConfig","{\"faceStatus\":\"N\"}"));
		list.add(new ExternParams("edgeData","d+lrknzpmp4Cr+Zi9dO3xEB4rm04p31+Ur4zHQwsHq3If+nv7hzg6B0PheVUuERQ"));
		pb.externParams=list1;
		
		pb.sdkVersion="2.0.0.3";
		
		return pb;
	}

}
