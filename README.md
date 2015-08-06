# Bukkit-PlayerWarn

Bukkit PlayerWarn is a plugin for a Bukkit server that adds the ability for anyone to 'warn' another player. It is mainly intended as a demonstration of [my SimplePlugin library](https://github.com/ZachOhara/Bukkit-SimplePlugin). I highly encourage anyone interested in using my SimplePlugin library to play around with this plugin, and use it as a platform for experimentation with SimplePlugin. The current version is confirmed to work with Spigot-CraftBukkit version 1.8.8, and will maybe work on later versions without modification. A full list of commands that this plugin adds is included below.

This plugin uses my Bukkit SimplePlugin Library. The server *must* have that plugin installed for this plugin to work. SimplePlugin can be downloaded from [GitHub](https://github.com/ZachOhara/Bukkit-SimplePlugin)

Along with all of the source code, in the root folder of this repository you'll find [detailed documentation](javadoc) and a compiled .jar version of the project.

I may or may not support this software in the future, but feel free to send a pull request if you think you have a way to improve it. There is no warranty on this software, and I am absolutely not going to do full-time tech support for it, but I will try to be as helpful as I can if you're having problems. Send me an email, or create a new issue.

This entire repository is made available under the GNU General Public License v3.0. A full copy of this license is available as the [LICENSE](LICENSE) file in this repository, or at [gnu.org/licenses](http://www.gnu.org/licenses/).

## Installation

Download the "PlayerWarn v___.jar" from the root folder of this repository, or check out the [releases page](https://github.com/ZachOhara/Bukkit-PlayerWarn/releases) and download the latest version. Drop either file into the 'plugins' folder on your server.

## Added Commands:

### BanCraft

Usage: `/warn <player>`

Using the 'warn' command on a player will send them a message reading "{sender} has warned you!", with "{sender}" being replaced by the name of the player or console that sent the command. If the command was sent by the console, the message will be followed by "Ooga booga!" (to help scare the targeted player into submission).
