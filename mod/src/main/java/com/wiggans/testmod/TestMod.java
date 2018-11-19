package com.wiggans.testmod;

import org.apache.logging.log4j.Logger;

import com.wiggans.testmod.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestMod.MODID, name = TestMod.NAME, version = TestMod.VERSION, acceptedMinecraftVersions = TestMod.MC_VERSION)
public class TestMod {
	
	public static final String MODID = "testmod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";
    
    public static final String CLIENT = "com.wiggans.testmod.proxy.ClientProxy";
    public static final String SERVER = "com.wiggans.testmod.proxy.ServerProxy";
 
    public static Logger logger;
    
    @SidedProxy(clientSide = TestMod.CLIENT, serverSide = TestMod.SERVER)
    public static IProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
