package com.bryce.demo.serial;

import tech.cnmn.simpl_serial_port.exception.SendDataToSerialPortFailure;
import tech.cnmn.simpl_serial_port.exception.SerialPortOutputStreamCloseFailure;
import tech.cnmn.simpl_serial_port.listener.PortListener;

public class SerialPortListener extends PortListener {
    @Override
    public void onReadException(Exception e) {
        System.out.println("监听串口发生异常");
        e.printStackTrace();
    }

    @Override
    public void onReceive(byte[] bytes) {
        String dataStr = new String(bytes).trim();
        System.out.println("接收到串口数据：" + dataStr);

        try {
            serialPortVo.sendData("test".getBytes());
        } catch (SendDataToSerialPortFailure sendDataToSerialPortFailure) {
            sendDataToSerialPortFailure.printStackTrace();
        } catch (SerialPortOutputStreamCloseFailure serialPortOutputStreamCloseFailure) {
            serialPortOutputStreamCloseFailure.printStackTrace();
        }
    }
}
