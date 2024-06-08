inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "sva-gmm"

DEPENDS += "sva-common sva-listen-common sva-swmad"

PBT_ARCH = "armv8-2a"

SRC_URI[sha256sum] = "0b6ec4b2ce8b47de50e37bccdf50f3239121ec875e0def0786412c8542810286"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"
