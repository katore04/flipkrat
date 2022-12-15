package com.flipkart;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * webappflipkart java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("webappflipkart");

  public void onEnable()
  {
    LOGGER.info("webappflipkart enabled");
  }

  public void onDisable()
  {
    LOGGER.info("webappflipkart disabled");
  }
}
