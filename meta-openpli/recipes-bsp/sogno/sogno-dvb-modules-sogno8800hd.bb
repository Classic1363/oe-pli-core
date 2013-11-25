KV = "3.9.7"
SRCDATE = "20131125"

SRC_URI[md5sum] = "04a135f3518f6c9875352b725ac70e44"
SRC_URI[sha256sum] = "c1c750230bb9b926a663dfac9ce3da7be5fd8ec8e0a1d660912fdf9cb74c3f92"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
