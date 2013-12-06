KV = "3.9.7"
SRCDATE = "20131207"

SRC_URI[md5sum] = "7951ab085864332f324d822490e164ad"
SRC_URI[sha256sum] = "abeed9963ddec93c62d3366e9b183105645387899b314b4de39a6cb21cf37355"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
