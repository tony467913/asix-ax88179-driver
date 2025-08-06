TARGET	= ax_usb_nic
KDIR	:= $(KERNEL_SRC)
PWD	= $(shell pwd)


obj-m := $(TARGET).o
$(TARGET)-objs := ax_main.o ax88179_178a.o ax88179a_772d.o


all:
	$(MAKE) -C $(KDIR) M=$(PWD)

modules_install:
	$(MAKE) -C $(KDIR) M=$(PWD) modules_install

clean:
	rm -rf *_programmer *_ieee .tmp_versions