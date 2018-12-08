/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: E:\\code\\opencamera\\src\\main\\rs\\avg_brighten.rs
 */

package net.sourceforge.opencamera;

import android.os.Build;
import android.os.Process;
import java.lang.reflect.Field;
import android.renderscript.*;
import android.content.res.Resources;

/**
 * @hide
 */
public class ScriptC_avg_brighten extends ScriptC {
    private static final String __rs_resource_name = "avg_brighten";
    // Constructor
    public  ScriptC_avg_brighten(RenderScript rs) {
        this(rs,
             rs.getApplicationContext().getResources(),
             rs.getApplicationContext().getResources().getIdentifier(
                 __rs_resource_name, "raw",
                 rs.getApplicationContext().getPackageName()));
    }

    public  ScriptC_avg_brighten(RenderScript rs, Resources resources, int id) {
        super(rs, resources, id);
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_median_filter_strength = 1.f;
        __F32 = Element.F32(rs);
        __U8_4 = Element.U8_4(rs);
        __F32_3 = Element.F32_3(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __F32_3;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_bitmap = 0;
    private Allocation mExportVar_bitmap;
    public synchronized void set_bitmap(Allocation v) {
        setVar(mExportVarIdx_bitmap, v);
        mExportVar_bitmap = v;
    }

    public Allocation get_bitmap() {
        return mExportVar_bitmap;
    }

    public Script.FieldID getFieldID_bitmap() {
        return createFieldID(mExportVarIdx_bitmap, null);
    }

    private final static int mExportVarIdx_median_filter_strength = 1;
    private float mExportVar_median_filter_strength;
    public synchronized void set_median_filter_strength(float v) {
        setVar(mExportVarIdx_median_filter_strength, v);
        mExportVar_median_filter_strength = v;
    }

    public float get_median_filter_strength() {
        return mExportVar_median_filter_strength;
    }

    public Script.FieldID getFieldID_median_filter_strength() {
        return createFieldID(mExportVarIdx_median_filter_strength, null);
    }

    private final static int mExportVarIdx_gain = 2;
    private float mExportVar_gain;
    public synchronized void set_gain(float v) {
        setVar(mExportVarIdx_gain, v);
        mExportVar_gain = v;
    }

    public float get_gain() {
        return mExportVar_gain;
    }

    public Script.FieldID getFieldID_gain() {
        return createFieldID(mExportVarIdx_gain, null);
    }

    private final static int mExportVarIdx_gain_A = 3;
    private float mExportVar_gain_A;
    public synchronized void set_gain_A(float v) {
        setVar(mExportVarIdx_gain_A, v);
        mExportVar_gain_A = v;
    }

    public float get_gain_A() {
        return mExportVar_gain_A;
    }

    public Script.FieldID getFieldID_gain_A() {
        return createFieldID(mExportVarIdx_gain_A, null);
    }

    private final static int mExportVarIdx_gain_B = 4;
    private float mExportVar_gain_B;
    public synchronized void set_gain_B(float v) {
        setVar(mExportVarIdx_gain_B, v);
        mExportVar_gain_B = v;
    }

    public float get_gain_B() {
        return mExportVar_gain_B;
    }

    public Script.FieldID getFieldID_gain_B() {
        return createFieldID(mExportVarIdx_gain_B, null);
    }

    private final static int mExportVarIdx_gamma = 5;
    private float mExportVar_gamma;
    public synchronized void set_gamma(float v) {
        setVar(mExportVarIdx_gamma, v);
        mExportVar_gamma = v;
    }

    public float get_gamma() {
        return mExportVar_gamma;
    }

    public Script.FieldID getFieldID_gamma() {
        return createFieldID(mExportVarIdx_gamma, null);
    }

    private final static int mExportVarIdx_low_x = 6;
    private float mExportVar_low_x;
    public synchronized void set_low_x(float v) {
        setVar(mExportVarIdx_low_x, v);
        mExportVar_low_x = v;
    }

    public float get_low_x() {
        return mExportVar_low_x;
    }

    public Script.FieldID getFieldID_low_x() {
        return createFieldID(mExportVarIdx_low_x, null);
    }

    private final static int mExportVarIdx_mid_x = 7;
    private float mExportVar_mid_x;
    public synchronized void set_mid_x(float v) {
        setVar(mExportVarIdx_mid_x, v);
        mExportVar_mid_x = v;
    }

    public float get_mid_x() {
        return mExportVar_mid_x;
    }

    public Script.FieldID getFieldID_mid_x() {
        return createFieldID(mExportVarIdx_mid_x, null);
    }

    private final static int mExportVarIdx_max_x = 8;
    private float mExportVar_max_x;
    public synchronized void set_max_x(float v) {
        setVar(mExportVarIdx_max_x, v);
        mExportVar_max_x = v;
    }

    public float get_max_x() {
        return mExportVar_max_x;
    }

    public Script.FieldID getFieldID_max_x() {
        return createFieldID(mExportVarIdx_max_x, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_avg_brighten_gain = 1;
    public Script.KernelID getKernelID_avg_brighten_gain() {
        return createKernelID(mExportForEachIdx_avg_brighten_gain, 35, null, null);
    }

    public void forEach_avg_brighten_gain(Allocation ain, Allocation aout) {
        forEach_avg_brighten_gain(ain, aout, null);
    }

    public void forEach_avg_brighten_gain(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_avg_brighten_gain, ain, aout, null, sc);
    }

    private final static int mExportForEachIdx_avg_brighten_f = 2;
    public Script.KernelID getKernelID_avg_brighten_f() {
        return createKernelID(mExportForEachIdx_avg_brighten_f, 59, null, null);
    }

    public void forEach_avg_brighten_f(Allocation ain, Allocation aout) {
        forEach_avg_brighten_f(ain, aout, null);
    }

    public void forEach_avg_brighten_f(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__F32_3)) {
            throw new RSRuntimeException("Type mismatch with F32_3!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_avg_brighten_f, ain, aout, null, sc);
    }

    private final static int mExportFuncIdx_setBlackLevel = 0;
    public void invoke_setBlackLevel(float value) {
        FieldPacker setBlackLevel_fp = new FieldPacker(4);
        setBlackLevel_fp.addF32(value);
        invoke(mExportFuncIdx_setBlackLevel, setBlackLevel_fp);
    }

}

