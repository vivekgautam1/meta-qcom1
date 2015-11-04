SUMMARY = "Simple AWS IoT Image with Arrow DragonConnect"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

CORE_IMAGE_BASE_INSTALL += "aws-iot-dragonconnect \
                            e2fsprogs-resize2fs kernel-modules connman"

EXTRA_USERS_PARAMS = "\
useradd -p '' linaro; \
"
