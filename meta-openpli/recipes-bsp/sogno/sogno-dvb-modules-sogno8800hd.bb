KV = "3.9.7"
SRCDATE = "20131126"

SRC_URI[md5sum] = "e8f4ec779ce1b54ed211b84989568861"
SRC_URI[sha256sum] = "cf8d3cb90f654b0bf6a31ba70394e15b8163c3ac510c6bc58fb6981c2a9d58da"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
