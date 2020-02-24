package com.json.netty;

import org.springframework.stereotype.Component;

import com.json.netty.util.ResponseType;

@Component
public class GenerateFullInfo {

	public String setValue(String NIK, String user_id, String password, String ip_user) {
		// Your logic can go here! If you return a POJO, Camel will try and serialise it
		// to JSON.
		return "{\"NO_KK\": 1801092710150001,\r\n" + "   \"NIK\": " + NIK + ",\r\n"
				+ "   \"NAMA_LGKP\": \"FENDIYANTO\",\r\n" + "   \"KAB_NAME\": \"LAMPUNG SELATAN\",\r\n"
				+ "   \"AGAMA\": \"ISLAM\",\r\n" + "   \"NO_RW\": 3,\r\n" + "   \"KEC_NAME\": \"PENENGAHAN\",\r\n"
				+ "   \"JENIS_PKRJN\": \"BELUM/TIDAK BEKERJA\",\r\n" + "   \"NO_RT\": 5,\r\n"
				+ "   \"NO_KEL\": 2019,\r\n" + "   \"ALAMAT\": \"DUSUN BURING DESA SUKABARU\",\r\n"
				+ "   \"NO_KEC\": 9,\r\n" + "   \"TMPT_LHR\": \"BURING\",\r\n"
				+ "   \"PDDK_AKH\": \"TAMAT SD/SEDERAJAT\",\r\n" + "   \"STATUS_KAWIN\": \"BELUM KAWIN\",\r\n"
				+ "   \"NO_PROP\": 18,\r\n" + "   \"NAMA_LGKP_IBU\": \"SULYANA DEWI\",\r\n"
				+ "   \"PROP_NAME\": \"LAMPUNG\",\r\n" + "   \"NO_KAB\": 1,\r\n" + "   \"KEL_NAME\": \"SUKA BARU\",\r\n"
				+ "   \"JENIS_KLMIN\": \"Laki-Laki\",\r\n" + "   \"TGL_LHR\": \"1998-10-27\"}";
	}

}
