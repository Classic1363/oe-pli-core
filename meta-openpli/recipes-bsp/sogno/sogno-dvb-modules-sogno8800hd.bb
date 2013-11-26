KV = "3.9.7"
SRCDATE = "20131127"

SRC_URI[md5sum] = "24bace63eceda3217af3db8e0ecd5659"
SRC_URI[sha256sum] = "d66d4ee96ed04c6f8da40f1f3d9cb81c21586ef7c2701da79bf3952e714b9251"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
