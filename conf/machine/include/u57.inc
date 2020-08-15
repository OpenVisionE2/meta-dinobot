EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798mv200"
HICHIPSET = "3798mv200"
CHIPSET = "Hi3798Mv200"

KERNEL_MODULE_AUTOLOAD += "rt8188fu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u57"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u57 \
	dinobot-libs-u57 \
	dinobot-hihalt-u57 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u57"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u57"

MACHINETYPE = "u57"

SDCARDIMG = "no"

MACHINE_FEATURES += "blindscan-dvbs 7segment hiaccel RCA"

IMAGEDIR = "amiko/${MACHINE}"

STB_PLATFORM = "u57"

EXTRA_ALSA = "mv200"

RCNAME = "amiko6"
