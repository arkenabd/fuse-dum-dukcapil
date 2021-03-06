package com.json.netty;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.json.netty.util.ISOUtil;



@Service
public class GenerateIso {
	public String generate(String empId,String name) throws ISOException {
		String result = "";
		ISOUtil isoUtil = new ISOUtil();
		ISOMsg isoMsg = new ISOMsg();
		isoMsg = new ISOMsg();
		// Setting packager
		System.out.println("input from route: "+empId+";"+name);
		GenericPackager packager = new GenericPackager("src/main/resources/iso8583JPosXml.xml");

		isoMsg.setPackager(packager);

		// Setting MTI
		isoMsg.set(0, "0100");

		// Setting processing code
		isoMsg.set(3, "020000");

		// Setting transaction amount
		isoMsg.set(4, "5000");

		// Setting transmission date and time
		isoMsg.set(7, new SimpleDateFormat("MMddHHmmss").format(new Date()));

		// Setting system trace audit number
		isoMsg.set(11, "123456");

		// Setting data element #48
		isoMsg.set(48, "activate");
		result = isoUtil.pack(isoMsg);

		return result;
	}

}