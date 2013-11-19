KV = "3.9.7"
SRCDATE = "20131118"

SRC_URI[md5sum] = "47332b7912071024c349f05489b7834b"
SRC_URI[sha256sum] = "4325be598e4c6d4b081ccf3388f006ec57ce289c7851596c9cb6705e693f68dd"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
