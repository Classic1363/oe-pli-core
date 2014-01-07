KV = "3.9.7"
SRCDATE = "20140106"

RDEPENDS_${PN} += "sogno-mac-check"

SRC_URI[md5sum] = "3bc6577fde57f45163ca1fad5bbfe045"
SRC_URI[sha256sum] = "8d7afea4a8c60e8cebf897e5a102330fb149d589fcc3d8a87db3b054da88f0b1"

SRC_URI = "http://pluginvalley.kr/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
