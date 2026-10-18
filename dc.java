package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dc.class */
public final class dc extends cb {
    private int b;
    private boolean a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private boolean f251b;
    private boolean c;
    private boolean d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private by f252a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static cn f253a;
    private static boolean e;

    public dc() {
        super(8);
    }

    @Override // defpackage.a
    public final int a() {
        return 33;
    }

    @Override // defpackage.cb
    public final void b(int r6) {
        boolean zA;
        di.d();
        if (cx.f234a == null) {
            String[] strArr = new String[94];
            cx.f234a = strArr;
            strArr[0] = "GROUND_HILLS";
            cx.f234a[1] = "SLINGSHOT";
            cx.f234a[2] = "TERRAIN_TEXTURED_HILLS_1X1";
            cx.f234a[3] = "TERRAIN_TEXTURED_HILLS_5X2";
            cx.f234a[4] = "TERRAIN_TEXTURED_HILLS_5X5";
            cx.f234a[5] = "TERRAIN_TEXTURED_HILLS_10X2";
            cx.f234a[6] = "TERRAIN_TEXTURED_HILLS_10X10";
            cx.f234a[7] = "TERRAIN_TEXTURED_HILLS_32X2";
            cx.f234a[8] = "MISC_ESTRADE_7X2";
            cx.f234a[9] = "MISC_ESTRADE_9X3";
            cx.f234a[10] = "MISC_ESTRADE_11X3";
            cx.f234a[11] = "MISC_ESTRADE_1X2";
            cx.f234a[12] = "MISC_ESTRADE_2X2";
            cx.f234a[13] = "WOOD_BLOCK_1X1";
            cx.f234a[14] = "WOOD_BLOCK_2X1";
            cx.f234a[15] = "WOOD_BLOCK_2X2";
            cx.f234a[16] = "WOOD_BLOCK_4X1";
            cx.f234a[17] = "WOOD_BLOCK_4X2";
            cx.f234a[18] = "WOOD_BLOCK_8X1";
            cx.f234a[19] = "WOOD_BLOCK_10X1";
            cx.f234a[20] = "WOOD_BLOCK_4X4_HOLLOW";
            cx.f234a[21] = "WOOD_CIRCLE_2X2";
            cx.f234a[22] = "WOOD_CIRCLE_4X4";
            cx.f234a[23] = "WOOD_TRIANGLE_4X4";
            cx.f234a[24] = "WOOD_TRIANGLE_4X4_HOLLOW";
            cx.f234a[25] = "STONE_BLOCK_1X1";
            cx.f234a[26] = "STONE_BLOCK_2X1";
            cx.f234a[27] = "STONE_BLOCK_2X2";
            cx.f234a[28] = "STONE_BLOCK_4X1";
            cx.f234a[29] = "STONE_BLOCK_4X2";
            cx.f234a[30] = "STONE_BLOCK_8X1";
            cx.f234a[31] = "STONE_BLOCK_10X1";
            cx.f234a[32] = "STONE_BLOCK_4X4_HOLLOW";
            cx.f234a[33] = "STONE_CIRCLE_2X2";
            cx.f234a[34] = "STONE_CIRCLE_4X4";
            cx.f234a[35] = "STONE_TRIANGLE_4X4";
            cx.f234a[36] = "STONE_TRIANGLE_4X4_HOLLOW";
            cx.f234a[37] = "ICE_BLOCK_1X1";
            cx.f234a[38] = "ICE_BLOCK_2X1";
            cx.f234a[39] = "ICE_BLOCK_2X2";
            cx.f234a[40] = "ICE_BLOCK_4X1";
            cx.f234a[41] = "ICE_BLOCK_4X2";
            cx.f234a[42] = "ICE_BLOCK_8X1";
            cx.f234a[43] = "ICE_BLOCK_10X1";
            cx.f234a[44] = "ICE_BLOCK_4X4_HOLLOW";
            cx.f234a[45] = "ICE_CIRCLE_2X2";
            cx.f234a[46] = "ICE_CIRCLE_4X4";
            cx.f234a[47] = "ICE_TRIANGLE_4X4";
            cx.f234a[48] = "ICE_TRIANGLE_4X4_HOLLOW";
            cx.f234a[49] = "PIG_BASIC_SMALL";
            cx.f234a[50] = "PIG_BASIC_MEDIUM";
            cx.f234a[51] = "PIG_BASIC_BIG";
            cx.f234a[52] = "PIG_HELMET";
            cx.f234a[53] = "PIG_MUSTACHE";
            cx.f234a[54] = "PIG_KING";
            cx.f234a[55] = "BIRD_RED";
            cx.f234a[57] = "BIRD_YELLOW";
            cx.f234a[56] = "BIRD_BLUE";
            cx.f234a[58] = "BIRD_WHITE";
            cx.f234a[59] = "BIRD_BLACK";
            cx.f234a[60] = "MISC_FOOD_EGG";
            cx.f234a[61] = "MISC_FOOD_APPLE";
            cx.f234a[62] = "MISC_FOOD_BANANA";
            cx.f234a[63] = "MISC_FOOD_STRAWBERRY";
            cx.f234a[64] = "MISC_FOOD_WATERMELON";
            cx.f234a[65] = "MISC_FOOD_DONUT";
            cx.f234a[66] = "MISC_FOOD_HAM";
            cx.f234a[67] = "MISC_BALLOON_YELLOW";
            cx.f234a[68] = "MISC_BALLOON_BLUE";
            cx.f234a[69] = "MISC_BALLOON_RED";
            cx.f234a[70] = "BREAKABLE_STATIC_BLOCK_1X1";
            cx.f234a[71] = "BREAKABLE_STATIC_BLOCK_32X2";
            cx.f234a[72] = "BREAKABLE_STATIC_BLOCK_32X1";
            cx.f234a[73] = "BREAKABLE_STATIC_BLOCK_INVISIBLE";
            cx.f234a[74] = "MISC_RUBBER_DUCK";
            cx.f234a[75] = "MISC_RUBBER_TRAMPOLINE";
            cx.f234a[76] = "MISC_METAL_BALL_GREY";
            cx.f234a[77] = "MISC_METAL_BALL_RED";
            cx.f234a[78] = "MISC_METAL_DIAMOND";
            cx.f234a[79] = "MISC_METAL_HOLYGRAIL";
            cx.f234a[80] = "MISC_METAL_PILLAR";
            cx.f234a[81] = "MISC_METAL_TIRE_2X2";
            cx.f234a[82] = "MISC_METAL_TIRE_3X3";
            cx.f234a[83] = "MISC_METAL_TIRE_4X4";
            cx.f234a[84] = "MISC_METAL_TOILET";
            cx.f234a[85] = "MISC_METAL_CHEST";
            cx.f234a[86] = "MISC_EXPLOSIVE_TNT";
            cx.f234a[87] = "MISC_BEACHBALL";
            cx.f234a[88] = "MISC_ROPE_THICK";
            cx.f234a[89] = "MISC_HELMET_SMALL";
            cx.f234a[90] = "MISC_HELMET_BIG";
            cx.f234a[91] = "MISC_HELMET_BOSS";
            cx.f234a[92] = "MISC_EGG_SUPER_BOWL";
            cx.f234a[93] = "MISC_PROP_WHITE_EGG";
        }
        e = false;
        int r0 = this.b + 7;
        if (r0 < 22) {
            byte[] bArrM56a = av.m56a(r0);
            char[] cArr = new char[bArrM56a.length];
            for (int r8 = 0; r8 < cArr.length; r8++) {
                cArr[r8] = (char) bArrM56a[r8];
            }
            zA = dr.a(new String(cArr));
        } else {
            zA = false;
        }
        e = zA;
        cx.f234a = null;
        a(((cb) this).a);
        this.f252a = new by();
        this.f252a.a(dn.a(7, 73), 0, 0);
    }

    public static void a(ac acVar) {
        acVar.c(2);
        acVar.c(25);
        acVar.c(16);
        acVar.c(26);
        if (e) {
            dd.a(acVar);
        }
    }

    @Override // defpackage.a
    /* JADX INFO: renamed from: a */
    public final void mo1a() {
        this.f252a.a(ac.a, ac.b);
        ci.f155a = null;
        di.b();
        if (this.a) {
            this.a = false;
            this.d = false;
            cn cnVar = new cn();
            f253a = cnVar;
            cnVar.a(((cb) this).a);
            if (e) {
                f253a.a(dr.a);
                this.f251b = true;
            }
            dr.a = null;
            this.c = e;
            if (f253a == null || f253a.a == null || f253a.a.f165a == null) {
                return;
            }
            f253a.a.f165a.d();
        }
    }

    @Override // defpackage.a
    public final void b() {
        cf cfVar = ((cb) this).a.f5a;
        cb cbVar = (cb) (((aq) cfVar).a.c.a > 0 ? cfVar.a(((aq) cfVar).a.c.f421a[0]) : null);
        int r0 = cbVar != null ? ((a) cbVar).a : -1;
        int r1 = r0;
        if (r0 != 12) {
            di.d();
            if (r1 != 11) {
                db.c();
            }
        }
    }

    @Override // defpackage.cb
    public final void a(int r2, int r3) {
    }

    @Override // defpackage.cb
    public final void a(int r6, int r7, int r8) {
        int r0 = this.f252a.a(r6, r7, r8);
        if (r0 != 0) {
            if (r0 == 73) {
                ((cb) this).a.m2a(9);
            }
        } else if (this.c) {
            f253a.a(r6, r7, r8);
        }
    }

    @Override // defpackage.cb
    public final void e() {
        if (this.d) {
            f253a.b();
            return;
        }
        this.d = true;
        if (this.c) {
            if (this.f251b) {
                this.f251b = false;
                if (((dk) ((cb) this).a.m4a(12)).a(a(false), false)) {
                    ((cb) this).a.m2a(12);
                    return;
                }
                return;
            }
            return;
        }
        l lVar = ((cb) this).a.f7a.a;
        int r0 = lVar.a;
        for (int r8 = 0; r8 < r0 && lVar.f421a[r8] != 6; r8++) {
        }
        ((cb) this).a.a();
    }

    @Override // defpackage.cb
    public final void f() {
        if (this.c) {
            f253a.c();
            if (((cb) this).a.m3a() == this) {
                this.f252a.b(0, 0);
                ae.a(2, Integer.toString(f253a.f161a), null, -3, 3, 8192, 0);
            }
        }
    }

    public final void c(int r4) {
        this.b = r4;
        this.a = true;
        ((cb) this).a.m2a(8);
        de.b(r4);
        if (r4 - de.a(0) == 0) {
            cc.b(0, 0);
            ((cb) this).a.m2a(5);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m140a() {
        boolean zA = cd.a(this.b, f253a.f161a, m144e());
        if (this.b + 1 < 15) {
            cd.a(this.b + 1, 0, 0);
        }
        return zA;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final int m141b() {
        return q.c(0, this.b);
    }

    public final int c() {
        return m141b() - de.a(cd.f150a);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final boolean m142b() {
        int r0 = this.b + 1;
        return r0 < 15 && cd.m99a(r0) >= 0;
    }

    public final void i() {
        int r0 = this.b + 1;
        if (r0 < 15) {
            c(r0);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    final String m143a() {
        return cd.m100a(this.b);
    }

    static int d() {
        return f253a.f161a;
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    static int m144e() {
        if (f253a.f161a >= f253a.c) {
            return 3;
        }
        return f253a.f161a >= f253a.f163b ? 2 : 1;
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    final int m145f() {
        return cd.b(this.b);
    }

    final int g() {
        return cd.m99a(this.b);
    }

    static int a(boolean z) {
        return z ? f253a.d | ce.f151a : f253a.d & (ce.f151a ^ (-1));
    }

    final void j() {
        f253a.a.f165a.c();
        this.a = true;
    }

    @Override // defpackage.cb
    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public final void mo146g() {
        if (f253a != null && f253a.a != null) {
            f253a.a.f168a.d();
        }
        ((cb) this).a.m2a(9);
    }
}
