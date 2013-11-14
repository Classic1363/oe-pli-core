KV = "3.9.7"
SRCDATE = "20131114"

SRC_URI[md5sum] = "8bf731eb5af1093f88eac8b7ca5bc661"
SRC_URI[sha256sum] = "846a0eeb62b606b9f036cb99881169ed673867c8f64e1961f90fab5546cab02b"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
