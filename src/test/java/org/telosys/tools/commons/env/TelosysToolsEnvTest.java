package org.telosys.tools.commons.env;

import junit.framework.TestCase;

import org.telosys.tools.commons.TelosysToolsException;

public class TelosysToolsEnvTest extends TestCase {

	public void printSeparator() {
		System.out.println("==============================================================" );
	}
	
	public void test1() throws TelosysToolsException {
		printSeparator();
		System.out.println("Test TelosysToolsEnv ...");
		TelosysToolsEnv telosysToolsEnv = TelosysToolsEnv.getInstance();
		
		assertEquals("TelosysTools", telosysToolsEnv.getTelosysToolsFolder() );
		assertEquals("TelosysTools/downloads", telosysToolsEnv.getDownloadsFolder() );
		assertEquals("TelosysTools/lib", telosysToolsEnv.getLibrariesFolder() );
		assertEquals("TelosysTools", telosysToolsEnv.getModelsFolder() );
		assertEquals("TelosysTools/templates", telosysToolsEnv.getTemplatesFolder() );
		
		assertEquals("telosys-tools.cfg",              telosysToolsEnv.getTelosysToolsConfigFileName() );
		assertEquals("TelosysTools/telosys-tools.cfg", telosysToolsEnv.getTelosysToolsConfigFilePath() );

		assertEquals("databases.dbcfg",                telosysToolsEnv.getDatabasesDbCfgFileName() );
		assertEquals("TelosysTools/databases.dbcfg",   telosysToolsEnv.getDatabasesDbCfgFilePath() );
		
	}

}
