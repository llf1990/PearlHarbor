package com.alkaid.pearlharbor.net.connection;

public class IConnection {
	
	private String mCid;
	private Object mConnection;
	
	public IConnection()
	{
		mCid = "";
		mConnection = null;
	}

	public void setCid(String cid)
	{
		mCid = cid;
	}
	
	public String getCid()
	{
		return mCid;
	}
	
	public void setReal(Object arg0) {
		// TODO Auto-generated method stub
		mConnection = arg0;
	}

	public Object getReal() {
		// TODO Auto-generated method stub
		return mConnection;
	}
}

