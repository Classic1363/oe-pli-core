KV = "3.9.7"
SRCDATE = "20131116"

SRC_URI[md5sum] = "00fca0d2bec25b26cae6125f4620e4cf"
SRC_URI[sha256sum] = "1a8ba8f37d56122119001a300757aa49bb6e3a3367458073b6107831cf9fbd44"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
