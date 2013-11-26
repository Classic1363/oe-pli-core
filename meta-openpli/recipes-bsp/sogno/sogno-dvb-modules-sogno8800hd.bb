KV = "3.9.7"
SRCDATE = "20131126"

SRC_URI[md5sum] = "e77a1b9817b0e01eba72a81ad76119ba"
SRC_URI[sha256sum] = "1f3ecc1d18c4c3f94535beafdb5f4f5876a2f0d562bd5a59119aa3b125f0be54"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
