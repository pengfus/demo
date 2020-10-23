package com.bryce.demo.serial;

import tech.cnmn.simpl_serial_port.exception.*;
import tech.cnmn.simpl_serial_port.utils.SerialTool;
import tech.cnmn.simpl_serial_port.vo.SerialPortVo;

import java.util.ArrayList;

public class SerialPort {
    public static void main(String[] args) {
        ArrayList<String> port =
                SerialTool.findPort();
        System.out.println(port);
        try {
            SerialPortVo serialPortVo = SerialTool.openPort("COM1", "COM1", 9600);
            System.out.println(serialPortVo);
            serialPortVo.bindListener(new SerialPortListener(),500);
            serialPortVo.sendData("send".getBytes());
            System.out.println("start listen");
        } catch (SerialPortParameterFailure serialPortParameterFailure) {
            serialPortParameterFailure.printStackTrace();
        } catch (NotASerialPort notASerialPort) {
            notASerialPort.printStackTrace();
        } catch (NoSuchPort noSuchPort) {
            noSuchPort.printStackTrace();
        } catch (PortInUse portInUse) {
            portInUse.printStackTrace();
        } catch (SendDataToSerialPortFailure sendDataToSerialPortFailure) {
            sendDataToSerialPortFailure.printStackTrace();
        } catch (SerialPortOutputStreamCloseFailure serialPortOutputStreamCloseFailure) {
            serialPortOutputStreamCloseFailure.printStackTrace();
        } catch (TooManyListeners tooManyListeners) {
            tooManyListeners.printStackTrace();
        }
    }
}
