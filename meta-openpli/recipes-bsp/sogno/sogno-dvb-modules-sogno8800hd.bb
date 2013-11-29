KV = "3.9.7"
SRCDATE = "20131130"

SRC_URI[md5sum] = "2ef9394801177d1132566ba03956b450"
SRC_URI[sha256sum] = "d6c3c21057d56cb67e1c512428873d7afe874a35d2e2163d0af400a3f7ac3a14"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
