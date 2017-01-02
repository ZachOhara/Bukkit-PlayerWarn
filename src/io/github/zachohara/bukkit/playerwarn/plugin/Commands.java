/* Copyright (C) 2017 Zach Ohara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.zachohara.bukkit.playerwarn.plugin;

import io.github.zachohara.bukkit.simpleplugin.command.CommandInstance;
import io.github.zachohara.bukkit.simpleplugin.command.CommandSet;
import io.github.zachohara.bukkit.simpleplugin.command.Implementation;
import io.github.zachohara.bukkit.simpleplugin.command.Properties;
import io.github.zachohara.bukkit.simpleplugin.command.Properties.Source;
import io.github.zachohara.bukkit.simpleplugin.command.Properties.Target;

/**
 * The {@code Commands} interface represents the set of commands supported by this plugin,
 * and contains a {@code Properties} object for each command.
 *
 * @author Zach Ohara
 * @see Properties
 */
public enum Commands implements CommandSet {

	WARN(new Properties(1, 1, Source.OP_ONLY, Target.ALL_ONLINE, new Warn()));

	/**
	 * The {@code Properties} object specific to a single command.
	 */
	private Properties properties;

	/**
	 * Constructs a new {@code Commands} with the given {@code Properties} for this
	 * command.
	 *
	 * @param p the {@code Properties} for this command.
	 */
	private Commands(Properties p) {
		this.properties = p;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Properties getProperties() {
		return this.properties;
	}

	private static class Warn extends Implementation {

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected boolean doPlayerCommand(CommandInstance instance) {
			instance.sendTargetMessage("%s has warned you!");
			return true;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected boolean doConsoleCommand(CommandInstance instance) {
			instance.sendTargetMessage("%s has warned you! Oooga booga!");
			return true;
		}

	}

}
