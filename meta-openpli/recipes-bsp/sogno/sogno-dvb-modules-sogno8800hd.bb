KV = "3.9.7"
SRCDATE = "20140103"

RDEPENDS_${PN} += "sogno-mac-check"

SRC_URI[md5sum] = "8be6edcb1d562c0c5cb127daeefb085a"
SRC_URI[sha256sum] = "9c53afe05af12ed8e247a879afae141e28b32ff91ea07acb6886c3186cc18ca7"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
