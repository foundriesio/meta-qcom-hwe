inherit autotools-brokensep pkgconfig

DESCRIPTION      = "Build Android libvmmem for LE"
LICENSE          = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM += "file://vmmem.cpp;beginline=1;endline=4;md5=e19ba7a648e00191388321a1e8a5c974 \
                      file://vmmem_wrapper.cpp;beginline=1;endline=4;md5=e19ba7a648e00191388321a1e8a5c974 \
                      file://include/vmmem.h;beginline=1;endline=4;md5=e19ba7a648e00191388321a1e8a5c974 \
                      file://include/vmmem_wrapper.h;beginline=1;endline=4;md5=e19ba7a648e00191388321a1e8a5c974"

DEPENDS += "linux-kernel-qcom-headers"

SRC_URI += "git://git.codelinaro.org/clo/le/platform/system/memory/libvmmem.git;protocol=https;rev=2b88e9bc6030893b8e9b46ae85999c8de103858d;branch=kernel.apps.lnx.4.0.r1-rel;destsuffix=system/memory/libvmmem"

S = "${WORKDIR}/system/memory/libvmmem"

EXTRA_OECONF:append = " \
    --with-sanitized-headers=${STAGING_INCDIR}/linux-kernel-qcom/usr/include \
    --disable-static \
"

PACKAGES +="${PN}-test-bin"

FILES:${PN}     = "${libdir}/* ${sysconfdir}/*"
FILES:${PN}-test-bin = "${base_bindir}/*"

PACKAGE_ARCH = "${MACHINE_ARCH}"
