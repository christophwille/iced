// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler16GenXTests extends CodeAssemblerTestsBase {
	CodeAssembler16GenXTests() {
		super(16);
	}

	@Test
	void vxorpd_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VXORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VXORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_zmm_zmm_zmm() {
		testAssembler(c -> c.vxorpd(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VXORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vxorpd_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, dword_bcst(0x0L).base(di)), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(xmm2, xmm3, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VXORPD_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPD_XMM_K1Z_XMM_XMMM128B64, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, dword_bcst(0x0L).base(di)), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorpd(ymm2, ymm3, ymmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VXORPD_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorpd(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPD_YMM_K1Z_YMM_YMMM256B64, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorpd_zmm_zmm_m() {
		testAssembler(c -> c.vxorpd(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPD_ZMM_K1Z_ZMM_ZMMM512B64, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vxorps_xmm_xmm_xmm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(xmm2, xmm3, xmm4), Instruction.create(Code.VEX_VXORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, xmm4), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, ICRegisters.xmm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_ymm_ymm_ymm() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(ymm2, ymm3, ymm4), Instruction.create(Code.VEX_VXORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, ymm4), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, ICRegisters.ymm4), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_zmm_zmm_zmm() {
		testAssembler(c -> c.vxorps(zmm2.k1(), zmm3, zmm4), applyK(Instruction.create(Code.EVEX_VXORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, ICRegisters.zmm4), Register.K1));
	}

	@Test
	void vxorps_xmm_xmm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, dword_bcst(0x0L).base(di)), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(xmm2, xmm3, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VXORPS_XMM_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(xmm2.k1(), xmm3, xmmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPS_XMM_K1Z_XMM_XMMM128B32, ICRegisters.xmm2, ICRegisters.xmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_ymm_ymm_m() {
		{ /* if (src2.isBroadcast()) */
			testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, dword_bcst(0x0L).base(di)), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, true, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX | TestInstrFlags.BROADCAST);
		} /* else */ { /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vxorps(ymm2, ymm3, ymmword_ptr(0x0L).base(si)), Instruction.create(Code.VEX_VXORPS_YMM_YMM_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vxorps(ymm2.k1(), ymm3, ymmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPS_YMM_K1Z_YMM_YMMM256B32, ICRegisters.ymm2, ICRegisters.ymm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vxorps_zmm_zmm_m() {
		testAssembler(c -> c.vxorps(zmm2.k1(), zmm3, zmmword_ptr(0x0L).base(si)), applyK(Instruction.create(Code.EVEX_VXORPS_ZMM_K1Z_ZMM_ZMMM512B32, ICRegisters.zmm2, ICRegisters.zmm3, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void xabort_i() {
		testAssembler(c -> c.xabort(-5), Instruction.create(Code.XABORT_IMM8, -5));
	}

	@Test
	void xadd_r8_r8() {
		testAssembler(c -> c.xadd(dl, bl), Instruction.create(Code.XADD_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xadd_m_r8() {
		testAssembler(c -> c.xadd(byte_ptr(0x0L).base(si), bl), Instruction.create(Code.XADD_RM8_R8, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xadd_r16_r16() {
		testAssembler(c -> c.xadd(dx, bx), Instruction.create(Code.XADD_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xadd_m_r16() {
		testAssembler(c -> c.xadd(word_ptr(0x0L).base(si), bx), Instruction.create(Code.XADD_RM16_R16, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xadd_r32_r32() {
		testAssembler(c -> c.xadd(edx, ebx), Instruction.create(Code.XADD_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xadd_m_r32() {
		testAssembler(c -> c.xadd(dword_ptr(0x0L).base(si), ebx), Instruction.create(Code.XADD_RM32_R32, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xbts_r16_r16() {
		testAssembler(c -> c.xbts(dx, bx), Instruction.create(Code.XBTS_R16_RM16, ICRegisters.dx, ICRegisters.bx), TestInstrFlags.NONE, com.github.icedland.iced.x86.dec.DecoderOptions.XBTS);
	}

	@Test
	void xbts_r32_r32() {
		testAssembler(c -> c.xbts(edx, ebx), Instruction.create(Code.XBTS_R32_RM32, ICRegisters.edx, ICRegisters.ebx), TestInstrFlags.NONE, com.github.icedland.iced.x86.dec.DecoderOptions.XBTS);
	}

	@Test
	void xbts_r16_m() {
		testAssembler(c -> c.xbts(dx, word_ptr(0x0L).base(si)), Instruction.create(Code.XBTS_R16_RM16, ICRegisters.dx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.NONE, com.github.icedland.iced.x86.dec.DecoderOptions.XBTS);
	}

	@Test
	void xbts_r32_m() {
		testAssembler(c -> c.xbts(edx, dword_ptr(0x0L).base(si)), Instruction.create(Code.XBTS_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), TestInstrFlags.NONE, com.github.icedland.iced.x86.dec.DecoderOptions.XBTS);
	}

	@Test
	void xchg_r8_r8() {
		testAssembler(c -> c.xchg(dl, bl), Instruction.create(Code.XCHG_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xchg_m_r8() {
		testAssembler(c -> c.xchg(byte_ptr(0x0L).base(si), bl), Instruction.create(Code.XCHG_RM8_R8, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xchg_r16_r16() {
		{ /* if (src.getRegister() == Register.AX) */
			testAssembler(c -> c.xchg(dx, ax), Instruction.create(Code.XCHG_R16_AX, ICRegisters.dx, ICRegisters.ax));
		} /* else */ testAssembler(c -> c.xchg(dx, bx), Instruction.create(Code.XCHG_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xchg_m_r16() {
		testAssembler(c -> c.xchg(word_ptr(0x0L).base(si), bx), Instruction.create(Code.XCHG_RM16_R16, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xchg_r32_r32() {
		{ /* if (src.getRegister() == Register.EAX) */
			testAssembler(c -> c.xchg(edx, eax), Instruction.create(Code.XCHG_R32_EAX, ICRegisters.edx, ICRegisters.eax));
		} /* else */ testAssembler(c -> c.xchg(edx, ebx), Instruction.create(Code.XCHG_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xchg_m_r32() {
		testAssembler(c -> c.xchg(dword_ptr(0x0L).base(si), ebx), Instruction.create(Code.XCHG_RM32_R32, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xcryptcbc() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xcryptcbc(), Instruction.create(Code.XCRYPTCBC_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xcryptcfb() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xcryptcfb(), Instruction.create(Code.XCRYPTCFB_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xcryptctr() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xcryptctr(), Instruction.create(Code.XCRYPTCTR_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xcryptecb() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xcryptecb(), Instruction.create(Code.XCRYPTECB_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xcryptofb() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xcryptofb(), Instruction.create(Code.XCRYPTOFB_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xend() {
		testAssembler(c -> c.xend(), Instruction.create(Code.XEND));
	}

	@Test
	void xgetbv() {
		testAssembler(c -> c.xgetbv(), Instruction.create(Code.XGETBV));
	}

	@Test
	void xor_r8_r8() {
		testAssembler(c -> c.xor(dl, bl), Instruction.create(Code.XOR_RM8_R8, ICRegisters.dl, ICRegisters.bl));
	}

	@Test
	void xor_m_r8() {
		testAssembler(c -> c.xor(byte_ptr(0x0L).base(si), bl), Instruction.create(Code.XOR_RM8_R8, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bl));
	}

	@Test
	void xor_r16_r16() {
		testAssembler(c -> c.xor(dx, bx), Instruction.create(Code.XOR_RM16_R16, ICRegisters.dx, ICRegisters.bx));
	}

	@Test
	void xor_m_r16() {
		testAssembler(c -> c.xor(word_ptr(0x0L).base(si), bx), Instruction.create(Code.XOR_RM16_R16, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.bx));
	}

	@Test
	void xor_r32_r32() {
		testAssembler(c -> c.xor(edx, ebx), Instruction.create(Code.XOR_RM32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void xor_m_r32() {
		testAssembler(c -> c.xor(dword_ptr(0x0L).base(si), ebx), Instruction.create(Code.XOR_RM32_R32, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ebx));
	}

	@Test
	void xor_r8_m() {
		testAssembler(c -> c.xor(dl, byte_ptr(0x0L).base(si)), Instruction.create(Code.XOR_R8_RM8, ICRegisters.dl, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r16_m() {
		testAssembler(c -> c.xor(dx, word_ptr(0x0L).base(si)), Instruction.create(Code.XOR_R16_RM16, ICRegisters.dx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r32_m() {
		testAssembler(c -> c.xor(edx, dword_ptr(0x0L).base(si)), Instruction.create(Code.XOR_R32_RM32, ICRegisters.edx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xor_r8_i() {
		{ /* if (dst.getRegister() == Register.AL) */
			testAssembler(c -> c.xor(al, -5), Instruction.create(Code.XOR_AL_IMM8, ICRegisters.al, -5));
		} /* else */ testAssembler(c -> c.xor(dl, -5), Instruction.create(Code.XOR_RM8_IMM8, ICRegisters.dl, -5));
	}

	@Test
	void xor_r16_i() {
		{ /* if (dst.getRegister() == Register.AX) */
			testAssembler(c -> c.xor(ax, 0x40B7), Instruction.create(Code.XOR_AX_IMM16, ICRegisters.ax, 0x40B7));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.xor(dx, -0x80), Instruction.create(Code.XOR_RM16_IMM8, ICRegisters.dx, -0x80));
			testAssembler(c -> c.xor(dx, 0x7F), Instruction.create(Code.XOR_RM16_IMM8, ICRegisters.dx, 0x7F));
		} /* else */ testAssembler(c -> c.xor(dx, 0x40B7), Instruction.create(Code.XOR_RM16_IMM16, ICRegisters.dx, 0x40B7));
	}

	@Test
	void xor_r32_i() {
		{ /* if (dst.getRegister() == Register.EAX) */
			testAssembler(c -> c.xor(eax, 0x7FFFFFFF), Instruction.create(Code.XOR_EAX_IMM32, ICRegisters.eax, 0x7FFFFFFF));
		} /* else */ { /* if (imm >= -0x80 && imm <= 0x7F) */
			testAssembler(c -> c.xor(edx, -0x80), Instruction.create(Code.XOR_RM32_IMM8, ICRegisters.edx, -0x80));
			testAssembler(c -> c.xor(edx, 0x7F), Instruction.create(Code.XOR_RM32_IMM8, ICRegisters.edx, 0x7F));
		} /* else */ testAssembler(c -> c.xor(edx, 0x7FFFFFFF), Instruction.create(Code.XOR_RM32_IMM32, ICRegisters.edx, 0x7FFFFFFF));
	}

	@Test
	void xor_m_i() {
		{ /* if (dst.size == MemoryOperandSize.QWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				// Skipping XOR_RM64_IMM8 - Not supported by current bitness
				// Skipping XOR_RM64_IMM8 - Not supported by current bitness
			} /* else */ // Skipping XOR_RM64_IMM32 - Not supported by current bitness
		} /* else */ { /* if (dst.size == MemoryOperandSize.DWORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.xor(dword_ptr(0x0L).base(di), -0x80), Instruction.create(Code.XOR_RM32_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.xor(dword_ptr(0x0L).base(di), 0x7F), Instruction.create(Code.XOR_RM32_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.xor(dword_ptr(0x0L).base(di), 0x7FFFFFFF), Instruction.create(Code.XOR_RM32_IMM32, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7FFFFFFF));
		} /* else */ { /* if (dst.size == MemoryOperandSize.WORD) */
			{ /* if (imm >= -0x80 && imm <= 0x7F) */
				testAssembler(c -> c.xor(word_ptr(0x0L).base(di), -0x80), Instruction.create(Code.XOR_RM16_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -0x80));
				testAssembler(c -> c.xor(word_ptr(0x0L).base(di), 0x7F), Instruction.create(Code.XOR_RM16_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x7F));
			} /* else */ testAssembler(c -> c.xor(word_ptr(0x0L).base(di), 0x40B7), Instruction.create(Code.XOR_RM16_IMM16, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), 0x40B7));
		} /* else */ { /* if (dst.size == MemoryOperandSize.BYTE) */
			testAssembler(c -> c.xor(byte_ptr(0x0L).base(di), -5), Instruction.create(Code.XOR_RM8_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
		}
		{
			assertInvalid(() -> {
				testAssembler(c -> c.xor(zmmword_ptr(0x0L).base(di), -5), Instruction.create(Code.XOR_RM8_IMM8, new MemoryOperand(ICRegisters.di, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), -5));
			});
		}
	}

	@Test
	void xorpd_xmm_xmm() {
		testAssembler(c -> c.xorpd(xmm2, xmm3), Instruction.create(Code.XORPD_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void xorpd_xmm_m() {
		testAssembler(c -> c.xorpd(xmm2, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.XORPD_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xorps_xmm_xmm() {
		testAssembler(c -> c.xorps(xmm2, xmm3), Instruction.create(Code.XORPS_XMM_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void xorps_xmm_m() {
		testAssembler(c -> c.xorps(xmm2, xmmword_ptr(0x0L).base(si)), Instruction.create(Code.XORPS_XMM_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xresldtrk() {
		testAssembler(c -> c.xresldtrk(), Instruction.create(Code.XRESLDTRK));
	}

	@Test
	void xrstor_m() {
		testAssembler(c -> c.xrstor(mem_ptr(0x0L).base(si)), Instruction.create(Code.XRSTOR_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xrstors_m() {
		testAssembler(c -> c.xrstors(mem_ptr(0x0L).base(si)), Instruction.create(Code.XRSTORS_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsave_m() {
		testAssembler(c -> c.xsave(mem_ptr(0x0L).base(si)), Instruction.create(Code.XSAVE_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsavec_m() {
		testAssembler(c -> c.xsavec(mem_ptr(0x0L).base(si)), Instruction.create(Code.XSAVEC_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaveopt_m() {
		testAssembler(c -> c.xsaveopt(mem_ptr(0x0L).base(si)), Instruction.create(Code.XSAVEOPT_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsaves_m() {
		testAssembler(c -> c.xsaves(mem_ptr(0x0L).base(si)), Instruction.create(Code.XSAVES_MEM, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void xsetbv() {
		testAssembler(c -> c.xsetbv(), Instruction.create(Code.XSETBV));
	}

	@Test
	void xsha1() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xsha1(), Instruction.create(Code.XSHA1_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xsha256() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xsha256(), Instruction.create(Code.XSHA256_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xsha512() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xsha512(), Instruction.create(Code.XSHA512_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xsha512_alt() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xsha512_alt(), Instruction.create(Code.XSHA512_ALT_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xstore() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xstore(), Instruction.create(Code.XSTORE_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xstore_alt() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { // skip (getBitness() >= 32) not supported by this CodeAssembler bitness
		} /* else */ testAssembler(c -> c.xstore_alt(), Instruction.create(Code.XSTORE_ALT_16), TestInstrFlags.REMOVE_REP_REPNE_PREFIXES);
	}

	@Test
	void xsusldtrk() {
		testAssembler(c -> c.xsusldtrk(), Instruction.create(Code.XSUSLDTRK));
	}

	@Test
	void xtest() {
		testAssembler(c -> c.xtest(), Instruction.create(Code.XTEST));
	}

}