KV = "3.9.7"
SRCDATE = "20131108"

SRC_URI[md5sum] = "fa2ef8dbf146f3e99ca1f6440d8551de"
SRC_URI[sha256sum] = "7c038aef0fd5bc9613c69413084beeaa9fbbb8639d7f3d07f41dc6a235228804"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
