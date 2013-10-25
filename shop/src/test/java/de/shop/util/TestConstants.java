
package de.shop.util;

import static de.shop.util.Constants.REST_PATH;

public class TestConstants {

	public static final String WEB_PROJEKT = "shop";
	
	// https
	public static final String HTTPS = "https";
	public static final String HOST = "localhost";
	public static final int PORT = 8443;
	public static final String KEYSTORE_TYPE = "JKS";
	public static final String TRUSTSTORE_NAME = "client.truststore";
	public static final String TRUSTSTORE_PASSWORD = "Zimmermann";
	
	// Basis-URI
	// https://localhost:8443/shop/rest
	public static final String BASE_URI = HTTPS + "://" + HOST + "/" + WEB_PROJEKT + REST_PATH;
	
	// Pfade 
	
	// Bestellung
	public static final String BESTELLUNGEN_URI = BASE_URI + "/bestellung";
	public static final String BESTELLUNGEN_ID_PATH_PARAM = "bestellungId";
	public static final String BESTELLUNGEN_ID_URI = BESTELLUNGEN_URI + "/{" + BESTELLUNGEN_ID_PATH_PARAM + "}";
	public static final String BESTELLUNGEN_ID_KUNDE_URI = BESTELLUNGEN_ID_URI + "/kunde";
	
	private TestConstants() {
		
	}
			
}
