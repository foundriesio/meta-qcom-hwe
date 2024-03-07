inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "sva-cnn"

DEPENDS += "sva-common sva-listen-common sva-swmad sva-ml-commondwarf sva-ml-commondwarf2 sva-ml-commondwarf2-3 sva-eai capiv2-headers sva-eai-utils pdk-wrapper"

SRCREV = "9d16a54e57fc1802f5b81361efc92c423415c4b1"

SRC_URI = "git://qpm-git.qualcomm.com/home2/git/revision-history/qualcomm_linux-spf-1-0-le-qclinux-1-0-r1_api-linux_history_prebuilts.git;protocol=https;branch=LE.QCLINUX.1.0.R1"

PREBUILT_TARBALL = "sva-cnn_git_${PACKAGE_ARCH}.tar.gz"

S = "${WORKDIR}/git/apps_proc/prebuilt_HY22"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
