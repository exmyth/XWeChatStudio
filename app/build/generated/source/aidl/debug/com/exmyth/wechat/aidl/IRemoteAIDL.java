/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\WorkSpace\\AndroidStudioProjects\\XWeChat\\app\\src\\main\\aidl\\com\\exmyth\\wechat\\aidl\\IRemoteAIDL.aidl
 */
package com.exmyth.wechat.aidl;
// Declare any non-default types here with import statements
/** Example service interface */
public interface IRemoteAIDL extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.exmyth.wechat.aidl.IRemoteAIDL
{
private static final java.lang.String DESCRIPTOR = "com.exmyth.wechat.aidl.IRemoteAIDL";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.exmyth.wechat.aidl.IRemoteAIDL interface,
 * generating a proxy if needed.
 */
public static com.exmyth.wechat.aidl.IRemoteAIDL asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.exmyth.wechat.aidl.IRemoteAIDL))) {
return ((com.exmyth.wechat.aidl.IRemoteAIDL)iin);
}
return new com.exmyth.wechat.aidl.IRemoteAIDL.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_add:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.add(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.exmyth.wechat.aidl.IRemoteAIDL
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
//计算两个数的和

@Override public int add(int num1, int num2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(num1);
_data.writeInt(num2);
mRemote.transact(Stub.TRANSACTION_add, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_add = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
//计算两个数的和

public int add(int num1, int num2) throws android.os.RemoteException;
}
