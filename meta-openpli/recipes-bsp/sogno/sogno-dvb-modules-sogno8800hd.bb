KV = "3.9.7"
SRCDATE = "20131115"

SRC_URI[md5sum] = "ca40644789b7e475a839eb2323000053"
SRC_URI[sha256sum] = "b44ecd8b7bbbde061dd25a641f9fa32e69a4e2f2c37e2cd93ac630d64ad484c7"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
