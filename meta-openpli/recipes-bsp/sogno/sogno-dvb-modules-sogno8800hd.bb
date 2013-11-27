KV = "3.9.7"
SRCDATE = "20131128"

SRC_URI[md5sum] = "429b7a96347c512f8ac2139cbd9e678c"
SRC_URI[sha256sum] = "b71a687b2e21e5249392f75f5dbfef8812b0205c26af346c88cc39bdeff0db57"

SRC_URI = "http://whitebox.host.sk/bcm/driver/sogno8800hd-drivers-${KV}-${SRCDATE}.zip"

require sogno-dvb-modules.inc
