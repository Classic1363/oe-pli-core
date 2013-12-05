DESCRIPTION = "mgcamd ${PV} softcam"
CAMNAME = "mgcamd"

RDEPENDS_${PN} = "libcrypto-compat"

PR = "r2"

SRC_URI = "http://whitebox.host.sk/bcm/mirrors/mgcamd${PV}.zip"

S = "${WORKDIR}/"

INHIBIT_PACKAGE_STRIP = "1"

CAMSTART = "sleep 3 ; start-stop-daemon -S -b -x /usr/bin/${CAMNAME}"

require softcam.inc

do_install() {
	install -d ${D}/usr/lib
	install -m 0644 ${S}/libcrypto.so.0.9.7 ${D}/usr/lib/libcrypto.so.0.9.7
	
	install -d ${D}/usr/bin
	install -m 0755 ${S}/mgcamd.mips ${D}/usr/bin/mgcamd
	
	install -d ${D}/usr/keys
	install -m 0644 ${S}/mg_cfg ${D}/usr/keys/mg_cfg
	install -m 0644 ${S}/newcamd.list ${D}/usr/keys/newcamd.list
	install -m 0644 ${S}/ccamd.list ${D}/usr/keys/cccamd.list
	install -m 0644 ${S}/ignore.list ${D}/usr/keys/ignore.list
	install -m 0644 ${S}/priority.list ${D}/usr/keys/priority.list
	install -m 0644 ${S}/replace.list ${D}/usr/keys/replace.list
	install -m 0644 ${S}/peer.cfg ${D}/usr/keys/peer.cfg
	install -m 0644 ${S}/SoftCam.Key ${D}/usr/keys/SoftCam.Key
}

FILES_${PN} += "/usr/keys"
FILES_${PN} += "/usr/lib"

SRC_URI[md5sum] = "68b51f73092c617d07a44fa154936dcb"
SRC_URI[sha256sum] = "d7b7845e21de475c116e42c525effd3cc4952552233fa661e4087053a2ff2939"
