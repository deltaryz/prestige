#!/bin/bash
./gradlew build
rm /Applications/MultiMC.app/Contents/MacOS/instances/1.16.4\ Fabric/.minecraft/mods/*prestige*
cp ./build/libs/prestige-1.0.0.jar "/Applications/MultiMC.app/Contents/MacOS/instances/1.16.4 Fabric/.minecraft/mods/"
/Applications/MultiMC.app/Contents/MacOS/MultiMC -l "1.16.4 Fabric"
