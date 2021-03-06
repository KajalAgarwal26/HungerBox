package com.hcl.ing.hungerbox.service;

import com.hcl.ing.hungerbox.dto.VendorRequestDto;
import com.hcl.ing.hungerbox.dto.VendorResponseDto;

public interface VendorService {
	
	VendorResponseDto getAllVendors();
	VendorResponseDto addVenders(VendorRequestDto vendorRequestDto);
	VendorResponseDto deleteVendor(Long vendorId);

}
