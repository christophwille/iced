// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

use crate::formatter::fmt_consts::*;
use crate::formatter::gas::FormatterString;
use crate::iced_constants::IcedConstants;
use alloc::boxed::Box;
use alloc::vec::Vec;
use lazy_static::lazy_static;

// GENERATOR-BEGIN: BcstTo
// ⚠️This was generated by GENERATOR!🦹‍♂️
#[rustfmt::skip]
static BCST_TO_DATA: [u8; 36] = [
	0x01,
	0x01,
	0x01,
	0x02,
	0x02,
	0x01,
	0x01,
	0x01,
	0x02,
	0x01,
	0x03,
	0x03,
	0x02,
	0x02,
	0x02,
	0x03,
	0x02,
	0x04,
	0x04,
	0x03,
	0x03,
	0x03,
	0x04,
	0x03,
	0x02,
	0x03,
	0x04,
	0x01,
	0x02,
	0x03,
	0x01,
	0x02,
	0x03,
	0x02,
	0x03,
	0x04,
];
// GENERATOR-END: BcstTo

lazy_static! {
	pub(super) static ref MEM_SIZE_TBL: Box<[&'static FormatterString; IcedConstants::MEMORY_SIZE_ENUM_COUNT]> = {
		let mut v = Vec::with_capacity(IcedConstants::MEMORY_SIZE_ENUM_COUNT);
		let c = &*FORMATTER_CONSTANTS;
		for _ in 0..IcedConstants::FIRST_BROADCAST_MEMORY_SIZE as usize {
			v.push(&c.empty);
		}
		for &d in BCST_TO_DATA.iter() {
			let bcst_to = match d {
				// GENERATOR-BEGIN: BroadcastToKindMatch
				// ⚠️This was generated by GENERATOR!🦹‍♂️
				0x00 => &c.empty,
				0x01 => &c.b1to2,
				0x02 => &c.b1to4,
				0x03 => &c.b1to8,
				0x04 => &c.b1to16,
				// GENERATOR-END: BroadcastToKindMatch
				_ => unreachable!(),
			};
			v.push(bcst_to);
		}
		let v = v.into_boxed_slice();
		debug_assert_eq!(v.len(), IcedConstants::MEMORY_SIZE_ENUM_COUNT);
		// SAFETY: Size is verified above
		unsafe { Box::from_raw(Box::into_raw(v) as *mut [_; IcedConstants::MEMORY_SIZE_ENUM_COUNT]) }
	};
}
