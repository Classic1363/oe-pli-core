KV = "3.9.7"
SRCDATE = "20131115"

SRC_URI[md5sum] = "e7c9b8c2608006f926d6d385d1c410e1"
SRC_URI[sha256sum] = "3fc933824d131120b5e7a8d9512c457a14b2220076b637916ba8b0b9c8c6bc4c"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
