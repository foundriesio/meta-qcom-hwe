inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "sva-paramparser"

DEPENDS += "sva-listen-sound-model-headers sva-common"

PBT_ARCH = "armv8-2a"

SRC_URI[sha256sum] = "2a94b54f2dd5c19c33fb9aa4128252145a82a14fd8674f5266b6e8001c3a1820"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"
