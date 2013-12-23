KV = "3.9.7"
SRCDATE = "20131223"

RDEPENDS_${PN} += "sogno-mac-check"

SRC_URI[md5sum] = "fae2147cbe1388418b5f99ee0156d409"
SRC_URI[sha256sum] = "8e4fb91dbeb793cae8c0978ada056a3b9600b22719c64955cb6e2b6989544895"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
