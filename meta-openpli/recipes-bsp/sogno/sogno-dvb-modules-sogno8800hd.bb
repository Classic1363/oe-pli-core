KV = "3.9.7"
SRCDATE = "20131115"

SRC_URI[md5sum] = "906be7b37cd596a4f39b1db137a062f5"
SRC_URI[sha256sum] = "973d4f64beaf64857e6443d5e261c6f13a9fd734f94c96405c8a52c441d97849"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
