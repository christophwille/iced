// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

/**
 * Registers passed to {@link CodeAssembler} methods
 *
 * @see AsmRegisters
 * @see AsmRegistersGPR
 * @see AsmRegistersVec
 * @see AsmRegistersGPR8
 * @see AsmRegistersGPR16
 * @see AsmRegistersGPR32
 * @see AsmRegistersGPR64
 * @see AsmRegistersIP
 * @see AsmRegistersST
 * @see AsmRegistersCR
 * @see AsmRegistersDR
 * @see AsmRegistersTR
 * @see AsmRegistersBND
 * @see AsmRegistersK
 * @see AsmRegistersMM
 * @see AsmRegistersXMM
 * @see AsmRegistersYMM
 * @see AsmRegistersZMM
 * @see AsmRegistersTMM
 */
public final class AsmRegistersSegment {
	private AsmRegistersSegment() {
	}

	public static final AsmRegisterSegment es = AsmRegisters.es;
	public static final AsmRegisterSegment cs = AsmRegisters.cs;
	public static final AsmRegisterSegment ss = AsmRegisters.ss;
	public static final AsmRegisterSegment ds = AsmRegisters.ds;
	public static final AsmRegisterSegment fs = AsmRegisters.fs;
	public static final AsmRegisterSegment gs = AsmRegisters.gs;
}