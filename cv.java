package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cv.class */
public final class cv {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cw f214a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ah f215a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public am f216a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f217a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f218a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f219a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f220b;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private int f221e;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public int f223c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f224d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private float f225d;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ap f226a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public float f227b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public float f228c;
    private int f;
    public static cr a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final ah[] f222a = {new ah(de.a(5, 7), de.a(8, 9), de.a(18, 19), de.a(7, 8)), new ah(de.a(5, 7), de.a(8, 9), de.a(20, 21), de.a(7, 8)), new ah(de.a(5, 7), de.a(8, 9), de.a(22, 23), de.a(7, 8)), new ah(de.a(5, 7), de.a(8, 9), de.a(24, 25), de.a(7, 8)), new ah(de.a(5, 7), de.a(8, 9), de.a(26, 27), de.a(7, 8)), new ah(de.a(9, 10), de.a(11, 12), null, de.a(10, 11)), new ah(de.a(12, 13), de.a(13, 14), null, null), new ah(de.a(14, 15), de.a(15, 16), null, null), new ah(de.a(16, 17), de.a(17, 18), null, null)};

    public cv(an anVar, short s, float f, float f2, float f3) {
        am amVar;
        int r1;
        this.f214a = cx.a(s);
        cw cwVar = this.f214a;
        et etVar = new et();
        etVar.a = cwVar.f229a.b;
        etVar.f331a = true;
        etVar.e = true;
        etVar.f332b = true;
        etVar.f330b = 1.0f;
        etVar.d = false;
        if (cwVar.m132a()) {
            etVar.f330b = 2.0f;
            etVar.d = true;
            etVar.c = true;
        } else if (cwVar.b()) {
            etVar.c = true;
        }
        cw cwVar2 = this.f214a;
        ew ewVar = new ew();
        ewVar.a = cwVar2.a();
        ewVar.c = cwVar2.f229a.f209a;
        if (cwVar2.m132a()) {
            ewVar.f341a = 10.0f;
            ewVar.b = 0.0f;
        } else {
            ewVar.f341a = cwVar2.f229a.f210b;
            ewVar.b = cwVar2.f229a.c;
        }
        etVar.f328a.f60a = f;
        etVar.f328a.b = f2;
        etVar.f329a = f3;
        if (anVar.a()) {
            amVar = null;
        } else {
            am amVar2 = new am(etVar, anVar);
            amVar2.f33a = null;
            amVar2.f34b = anVar.f44a;
            if (anVar.f44a != null) {
                anVar.f44a.f33a = amVar2;
            }
            anVar.f44a = amVar2;
            anVar.b++;
            amVar = amVar2;
        }
        this.f216a = amVar;
        this.f216a.a(ewVar);
        this.f216a.f40a = this;
        this.b = this.f214a.m132a();
        this.f219a = false;
        this.d = false;
        this.c = false;
        if (this.f214a.f232a <= 0.0f) {
            cw cwVar3 = this.f214a;
            float fM130a = m130a() * this.f214a.f229a.d;
            this.f217a = fM130a;
            cwVar3.f232a = fM130a;
        } else {
            cw cwVar4 = this.f214a;
            float f4 = this.f214a.f232a;
            this.f217a = f4;
            cwVar4.f232a = f4;
        }
        this.f217a = (int) Math.max(1.0f, am.b(this.f217a));
        this.f225d = this.f214a.f229a.e;
        this.f227b = -99999.0f;
        this.f228c = -99999.0f;
        this.f223c = 0;
        this.f224d = 0;
        this.f = 0;
        if (f()) {
            this.f215a = f222a[3];
        } else if (j()) {
            this.f215a = f222a[4];
        } else if (q()) {
            this.f215a = f222a[2];
        } else if (i()) {
            this.f215a = f222a[1];
        } else if (this.f214a.m132a()) {
            this.f215a = f222a[0];
        } else if (b()) {
            this.f215a = f222a[5];
        } else if (this.f214a.a >= 13 && this.f214a.a <= 24) {
            this.f215a = f222a[6];
        } else if (this.f214a.a >= 25 && this.f214a.a <= 36) {
            this.f215a = f222a[8];
        }
        if (this.f214a.a >= 37 && this.f214a.a <= 48) {
            this.f215a = f222a[7];
        }
        if (!n()) {
            switch (this.f214a.a) {
                case 0:
                    r1 = 43;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 84:
                case 87:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    r1 = -1;
                    break;
                case 8:
                    r1 = 72;
                    break;
                case 9:
                    r1 = 73;
                    break;
                case 10:
                    r1 = 69;
                    break;
                case 11:
                    r1 = 70;
                    break;
                case 12:
                    r1 = 71;
                    break;
                case 60:
                    r1 = 78;
                    break;
                case 61:
                    r1 = 75;
                    break;
                case 62:
                    r1 = 76;
                    break;
                case 63:
                    r1 = 80;
                    break;
                case 64:
                    r1 = 81;
                    break;
                case 65:
                    r1 = 77;
                    break;
                case 66:
                    r1 = 79;
                    break;
                case 67:
                    r1 = 68;
                    break;
                case 68:
                    r1 = 66;
                    break;
                case 69:
                    r1 = 67;
                    break;
                case 70:
                case 71:
                case 72:
                case 73:
                    r1 = 0;
                    break;
                case 74:
                    r1 = 91;
                    break;
                case 75:
                    r1 = 92;
                    break;
                case 76:
                    r1 = 82;
                    break;
                case 77:
                    r1 = 83;
                    break;
                case 78:
                    r1 = 85;
                    break;
                case 79:
                    r1 = 86;
                    break;
                case 80:
                    r1 = 87;
                    break;
                case 81:
                    r1 = 88;
                    break;
                case 82:
                    r1 = 89;
                    break;
                case 83:
                    r1 = 90;
                    break;
                case 85:
                    r1 = 84;
                    break;
                case 86:
                    r1 = 74;
                    break;
                case 88:
                    r1 = 93;
                    break;
                case 93:
                    r1 = 78;
                    break;
            }
        } else {
            r1 = 0;
        }
        this.f221e = r1;
    }

    public final ct a() {
        return this.f214a.f229a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final cy m126a() {
        return this.f214a.f230a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m127a() {
        return this.f214a.c();
    }

    public final boolean b() {
        cw cwVar = this.f214a;
        return cwVar.a >= 49 && cwVar.a <= 54;
    }

    public final boolean c() {
        return this.f214a.m132a();
    }

    public final boolean d() {
        return this.f214a.b();
    }

    public final boolean e() {
        cw cwVar = this.f214a;
        return cwVar.a >= 0 && cwVar.a <= 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m128a() {
        if (this.f221e >= 0) {
            return this.f221e;
        }
        if (this.f214a.c()) {
            return 94 + ((this.f214a.a - 13) << 1) + m129b();
        }
        if (!b()) {
            if (this.f214a.m132a()) {
                return a(this.f214a.a, this);
            }
            if (this.f214a.b()) {
                return 45;
            }
            return h() ? 78 : 43;
        }
        int r6 = 0;
        int r0 = m129b();
        boolean z = this.f220b > 0 && r0 <= 0;
        int r1 = 47 + (z ? 12 : 0);
        switch (this.f214a.a) {
            case 49:
                r6 = 2;
                break;
            case 50:
                r6 = 1;
                break;
            case 51:
                r6 = 0;
                break;
            case 52:
                r6 = 3;
                break;
            case 53:
                r6 = 5;
                break;
            case 54:
                r6 = 4;
                break;
        }
        return r1 + (r6 * (z ? 1 : 2)) + r0;
    }

    public static final int a(int r3, cv cvVar) {
        int r5 = 0;
        boolean z = false;
        if (cvVar != null) {
            r5 = cvVar.f220b;
            z = cvVar.d;
        }
        switch (r3) {
            case 55:
                return r5 > 0 ? 292 : 291;
            case 56:
                return r5 > 0 ? 290 : 289;
            case 57:
                if (z) {
                    return cvVar.e ? 297 : 298;
                }
                return r5 > 0 ? 297 : 296;
            case 58:
                if (z) {
                    return 295;
                }
                return r5 > 0 ? 294 : 293;
            case 59:
                if (!z || cvVar == null) {
                    return r5 > 0 ? 286 : 285;
                }
                return ((int) ((((float) cvVar.f223c) / ((float) cvVar.f224d)) * 10.0f)) % 2 == 0 ? 288 : 287;
            default:
                return 43;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private final int m129b() {
        return (int) Math.ceil((this.f214a.f232a - this.f217a) / this.f214a.f232a);
    }

    public final boolean f() {
        return this.f214a.a == 58;
    }

    public final boolean g() {
        return this.f217a == this.f214a.f232a;
    }

    public final boolean h() {
        return this.f214a.a == 60;
    }

    public final boolean i() {
        return this.f214a.a == 56;
    }

    public final boolean j() {
        return this.f214a.a == 59;
    }

    public final boolean k() {
        if (this.f214a.m132a()) {
            return g() || j();
        }
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final float m130a() {
        return (r() ? this.f214a.f230a.a() : this.f216a.f38b / this.f216a.f35a.f333a) * this.f214a.f230a.b();
    }

    public final boolean a(float f) {
        if (r() || this.b || !this.f216a.b()) {
            return true;
        }
        return am.a(this.f216a.f29a.f60a) < eq.f * f && am.a(this.f216a.f29a.b) < eq.f * f && am.a(this.f216a.f30a) < 0.03490659f * f;
    }

    private boolean r() {
        return this.f216a.a == 0;
    }

    public final boolean l() {
        if (r()) {
            return false;
        }
        return this.f216a.f27a.a.f60a < a.a.f165a.h || this.f216a.f27a.a.f60a > a.a.f165a.i || this.f216a.f27a.a.b < cp.f || this.f216a.f27a.a.b > 10.0f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m131a(float f) {
        float f2 = this.f216a.f29a.f60a;
        float f3 = this.f216a.f29a.b;
        float fA = 1.0f + (f / co.a(f2, f3));
        this.f216a.a(new ap(f2 * fA, f3 * fA));
    }

    public final boolean m() {
        cw cwVar = this.f214a;
        return (cwVar.a >= 60 && cwVar.a <= 93) || cwVar.c();
    }

    public final boolean n() {
        return this.f214a.a >= 2 && this.f214a.a <= 7;
    }

    public final boolean o() {
        if (!this.f214a.m132a() || this.f219a || this.b) {
            return false;
        }
        if (a(5.0f)) {
            this.f += 33;
            return this.f224d <= 0 && this.f > 2000;
        }
        this.f = 0;
        return false;
    }

    public final boolean p() {
        return this.f214a.a == 86;
    }

    public final boolean q() {
        return this.f214a.a == 57;
    }

    public final float a(float f, boolean z, boolean z2) {
        if (this.f214a.m132a() || h()) {
            f = Math.max(f, 2.0f);
        }
        int r14 = (int) am.b(f);
        if (f >= this.f225d) {
            r14 = q.c(1, r14);
        }
        if (this.f225d >= 0.0f && !this.b) {
            if (r14 < this.f225d) {
                if (f > this.f225d / 2.0f) {
                    a((short) 0);
                }
                return this.f217a;
            }
            int r0 = (int) Math.min((int) (r14 - this.f225d), this.f217a);
            this.f217a -= r0;
            if (this.f214a.m132a()) {
                this.f217a = Math.max(1.0f, this.f217a);
                if (j() && this.f224d <= 0 && !this.d) {
                    this.f224d = 2000;
                    this.f223c = 0;
                    this.d = true;
                }
                a.a.f169a.a(this.f214a.f229a.f213c, this.f216a.f27a.a.f60a, this.f216a.f27a.a.b, m130a(), Math.min(2.0f, 0.5f + (f / 20.0f)));
            } else {
                this.f217a = Math.max(0.0f, this.f217a);
                if (z) {
                    int r1 = r0 * 10;
                    a.a.a.a(r1);
                    if (z2 && r1 > 0) {
                        Math.min(0.5f, r1 / 1000);
                        a.a.f169a.a(new StringBuffer().append(r1).append("").toString(), this.f216a.f27a.a.f60a, this.f216a.f27a.a.b - 1.0f);
                    }
                }
            }
            if (this.f217a <= 0.0f) {
                a((short) 1);
            } else if (f > this.f214a.f232a * 0.15f) {
                a((short) 0);
            } else {
                a((short) 0);
            }
            h();
            return this.f217a;
        }
        return this.f217a;
    }

    public final float a(ct ctVar) {
        ct ctVar2 = this.f214a.f229a;
        int r1 = ctVar.a;
        if (ctVar2.f211a == null) {
            return 1.0f;
        }
        for (int r7 = 0; r7 < ctVar2.f211a.length; r7 += 2) {
            if (ctVar2.f211a[r7] == r1) {
                return ctVar2.f211a[r7 + 1];
            }
        }
        return 1.0f;
    }

    public final float b(ct ctVar) {
        ct ctVar2 = this.f214a.f229a;
        int r1 = ctVar.a;
        if (ctVar2.f212b == null) {
            return 1.0f;
        }
        for (int r7 = 0; r7 < ctVar2.f212b.length; r7 += 2) {
            if (ctVar2.f212b[r7] == r1) {
                return ctVar2.f212b[r7 + 1];
            }
        }
        return 1.0f;
    }

    public final void a(short s) {
        if (this.f215a != null) {
            ah ahVar = this.f215a;
            if (s < 0 || s >= 4 || ahVar.a[s] == null || ahVar.a[s].length <= 0) {
                return;
            }
            db.b(ahVar.a[s][az.a(ahVar.a[s].length)]);
        }
    }
}
