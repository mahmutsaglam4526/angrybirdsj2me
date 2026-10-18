package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:co.class */
public final class co implements du {
    public cn a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cp f165a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    protected an f166a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cr f167a;
    private static int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public da f168a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cs f169a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f172a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f173b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private float f174b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static boolean f170a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static float f171a = 0.0f;
    public static boolean b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ap[] f175a = new ap[4];

    public co(cn cnVar) {
        this.a = cnVar;
    }

    public static void a() {
    }

    public final void b() {
        if (this.f167a == null) {
            return;
        }
        this.f167a.d();
        an anVar = this.f166a;
        am amVar = anVar.f44a;
        while (true) {
            am amVar2 = amVar;
            if (amVar2 == null) {
                return;
            }
            am amVar3 = amVar2.f34b;
            anVar.a(amVar2);
            amVar = amVar3;
        }
    }

    public final void a(cq cqVar) {
        b();
        this.f166a = new an(new ap(0.0f, 20.0f));
        this.f166a.f43a.f25a = this;
        this.f166a.f49a = false;
        this.f166a.a |= 4;
        this.f167a = new cr(this, cqVar);
        cv.a = this.f167a;
        this.f165a = new cp(this, cqVar);
        this.f168a = new da(this, this.f167a.f198a[1]);
        this.f173b = 0;
        this.f172a = 0;
        f170a = false;
        b = false;
        this.f169a = new cs();
    }

    public final void c() {
        an anVar = this.f166a;
        if ((anVar.a & 1) == 1) {
            anVar.f43a.a();
            anVar.a &= -2;
        }
        anVar.a |= 2;
        anVar.f52a.a = 0.033f;
        anVar.f52a.f353a = 10;
        anVar.f52a.f354b = 10;
        anVar.f52a.b = 30.30303f;
        anVar.f52a.c = anVar.f48a * 0.033f;
        ez ezVar = anVar.f52a;
        boolean z = anVar.f49a;
        ak akVar = anVar.f43a;
        fe feVarM180a = akVar.f22a;
        while (feVarM180a != null) {
            ev evVarM181a = feVarM180a.m181a();
            ev evVarM182b = feVarM180a.m182b();
            am amVar = evVarM181a.f335a;
            am amVar2 = evVarM182b.f335a;
            if (amVar.b() || amVar2.b()) {
                if ((feVarM180a.a & 8) == 8) {
                    if (amVar2.a(amVar)) {
                        if (akVar.f24a != null) {
                            ds dsVar = akVar.f24a;
                            if (!ds.a(evVarM181a, evVarM182b)) {
                                fe feVar = feVarM180a;
                                feVarM180a = feVar.m180a();
                                akVar.a(feVar);
                            }
                        }
                        feVarM180a.a &= -9;
                    } else {
                        fe feVar2 = feVarM180a;
                        feVarM180a = feVar2.m180a();
                        akVar.a(feVar2);
                    }
                }
                ej ejVar = evVarM181a.f337a;
                ej ejVar2 = evVarM182b.f337a;
                eh ehVar = akVar.a;
                dx dxVar = ejVar.a;
                dx dxVar2 = ejVar2.a;
                boolean z2 = dxVar2.a.f60a - dxVar.b.f60a <= 0.0f && dxVar2.a.b - dxVar.b.b <= 0.0f && dxVar.a.f60a - dxVar2.b.f60a <= 0.0f && dxVar.a.b - dxVar2.b.b <= 0.0f;
                if (z2) {
                    feVarM180a.a(akVar.f25a);
                    feVarM180a = feVarM180a.m180a();
                } else {
                    fe feVar3 = feVarM180a;
                    feVarM180a = feVar3.m180a();
                    akVar.a(feVar3);
                }
            } else {
                feVarM180a = feVarM180a.m180a();
            }
        }
        if (anVar.f52a.a > 0.0f) {
            anVar.a(anVar.f52a);
        }
        if (anVar.f50b && anVar.f52a.a > 0.0f) {
            fe feVar4 = anVar.f43a.f22a;
            while (true) {
                fe feVar5 = feVar4;
                if (feVar5 == null) {
                    break;
                }
                feVar5.a |= 4;
                feVar5.f363a = 0.0f;
                feVar4 = feVar5.b;
            }
            am amVar3 = anVar.f44a;
            while (true) {
                am amVar4 = amVar3;
                if (amVar4 == null) {
                    break;
                }
                if ((amVar4.b & 1) == 0 || amVar4.a == 1 || amVar4.a == 0) {
                    amVar4.b |= 64;
                } else {
                    amVar4.b &= -65;
                }
                amVar3 = amVar4.f34b;
            }
            am amVar5 = anVar.f44a;
            while (true) {
                am amVar6 = amVar5;
                if (amVar6 == null) {
                    break;
                }
                if ((amVar6.b & 64) != 64 && !amVar6.m14a()) {
                    anVar.b(amVar6);
                    amVar6.b |= 64;
                }
                amVar5 = amVar6.f34b;
            }
            am amVar7 = anVar.f44a;
            while (true) {
                am amVar8 = amVar7;
                if (amVar8 == null) {
                    break;
                }
                if ((amVar8.b & 64) != 64 && amVar8.m14a()) {
                    anVar.b(amVar8);
                    amVar8.b |= 64;
                }
                amVar7 = amVar8.f34b;
            }
        }
        if (anVar.f52a.a > 0.0f) {
            anVar.f48a = anVar.f52a.b;
        }
        if ((anVar.a & 4) == 4) {
            am amVar9 = anVar.f44a;
            while (true) {
                am amVar10 = amVar9;
                if (amVar10 == null) {
                    break;
                }
                amVar10.f31b.m21a();
                amVar9 = amVar10.f34b;
            }
        }
        anVar.a &= -3;
        this.f168a.a();
        this.f165a.a();
        this.f167a.a();
        this.f167a.c();
        this.f167a.b();
        this.f169a.c();
        if (f170a) {
            float f = f171a - 33.0f;
            f171a = f;
            if (f <= 0.0f) {
                if (this.f167a.m120c()) {
                    f171a = 1000.0f;
                } else {
                    b = true;
                }
            }
        }
        if (this.f173b < this.f172a) {
            this.f173b = q.b(this.f172a, this.f173b + 330);
        }
    }

    public final void d() {
        at.a(ac.a / 2, ac.b / 2);
        at.a(-1);
        at.c();
        at.a((-this.f165a.b) * 0.3f, this.f165a.m112c(this.f174b + 0.125f) * this.f165a.d);
        dd.m148a();
        at.d();
        at.b(this.f165a.d);
        at.b(8.0f);
        at.a(-this.f165a.b, -this.f165a.c);
        c = 0;
        at.a(0, 1);
        at.a(1, 1);
        this.f168a.c();
        this.f169a.d();
        at.c();
        float fM38a = at.m38a(0.0f);
        float fM38a2 = at.m38a(ac.a);
        for (int r8 = 0; r8 < this.f167a.f198a.length; r8++) {
            cv cvVar = this.f167a.f198a[r8];
            if (cvVar != null && cvVar.f214a != null && cvVar.f214a.a != 0) {
                ap apVar = cvVar.f216a.f27a.a;
                int r0 = cvVar.m128a();
                if (cvVar.e()) {
                    this.f174b = apVar.b;
                } else {
                    float f = cvVar.f216a.f28a.f326b;
                    if (cvVar.n() || !(r0 == 0 || cvVar.d())) {
                        float f2 = cvVar.f214a.f230a.f236a;
                        if (apVar.f60a >= fM38a - f2 && apVar.f60a <= fM38a2 + f2) {
                            c++;
                            if (cvVar.n()) {
                                at.c();
                                at.a(apVar.f60a, apVar.b);
                                at.a(f);
                                at.a(-11981792);
                                ev evVar = cvVar.f216a.f35a;
                                while (true) {
                                    ev evVar2 = evVar;
                                    if (evVar2 == null) {
                                        break;
                                    }
                                    eo eoVar = evVar2.f336a;
                                    if (eoVar.b == 1) {
                                        en enVar = (en) eoVar;
                                        ap[] apVarArrM167a = enVar.m167a();
                                        int r1 = enVar.m166a();
                                        for (int r12 = 0; r12 < r1; r12++) {
                                            if (apVarArrM167a[r12].f60a < 0.0f && apVarArrM167a[r12].b < 0.0f) {
                                                f175a[0] = apVarArrM167a[r12];
                                            } else if (apVarArrM167a[r12].f60a > 0.0f && apVarArrM167a[r12].b < 0.0f) {
                                                f175a[1] = apVarArrM167a[r12];
                                            } else if (apVarArrM167a[r12].f60a < 0.0f && apVarArrM167a[r12].b > 0.0f) {
                                                f175a[2] = apVarArrM167a[r12];
                                            } else if (apVarArrM167a[r12].f60a > 0.0f && apVarArrM167a[r12].b > 0.0f) {
                                                f175a[3] = apVarArrM167a[r12];
                                            }
                                        }
                                        at.g();
                                        for (int r13 = 0; r13 < 4; r13++) {
                                            at.b(f175a[r13].f60a, f175a[r13].b);
                                        }
                                        at.h();
                                    }
                                    evVar = evVar2.f334a;
                                }
                                at.a(-1);
                                at.d();
                            } else {
                                at.c();
                                at.a(apVar.f60a, apVar.b);
                                at.a(f);
                                at.b(0.125f);
                                at.a((-0.5f) * au.m43a(r0), (-0.5f) * au.m44b(r0));
                                if ((cvVar.b() || cvVar.m127a()) && f != 0.0f) {
                                    at.a(0, 0);
                                    at.a(1, 2);
                                } else {
                                    at.a(0, 1);
                                    at.a(1, 1);
                                }
                                at.c(r0);
                                at.d();
                            }
                            au.m49a();
                        }
                    } else {
                        au.m49a();
                    }
                }
            }
        }
        at.d();
        at.a(0, 1);
        at.a(1, 1);
        this.f168a.b();
        at.c();
        at.a(0.0f, this.f174b + 0.125f);
        at.b(0.125f);
        dd.b();
        at.d();
        this.f169a.e();
    }

    public static final float a(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static final float a(cv cvVar, cv cvVar2) {
        return a(cvVar.f216a.f27a.a.f60a - cvVar2.f216a.f27a.a.f60a, cvVar.f216a.f27a.a.b - cvVar2.f216a.f27a.a.b);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final an m106a() {
        return this.f166a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m107a() {
        return this.f165a.e >= 10000.0f && this.f167a.a(true);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m108a(float f, float f2) {
        if (f170a) {
            return;
        }
        if (this.f167a.b >= 0) {
            if (this.f167a.c == 0) {
                this.f167a.c = 1;
                return;
            } else {
                this.f167a.b = -1;
                this.f165a.b(2);
                return;
            }
        }
        if (this.f165a.e == 0.0f && this.f168a.a(this.f165a.m110a(f), this.f165a.m111b(f2))) {
            this.f165a.f181a = false;
        } else {
            this.f165a.a(f);
        }
    }

    public final void a(int r6, int r7) {
        if (!f170a && this.f167a.b < 0) {
            if (this.f165a.e == 0.0f && this.f168a.b(this.f165a.m110a(r6), this.f165a.m111b(r7))) {
                return;
            }
            this.f165a.c(r6);
        }
    }

    public final void b(int r6, int r7) {
        if (f170a) {
            return;
        }
        if (this.f167a.b < 0 && this.f165a.e == 0.0f) {
            this.f168a.c(this.f165a.m110a(r6), this.f165a.m111b(r7));
        }
        this.f165a.b(r6);
    }

    public final void a(int r4) {
        if (f170a || this.f167a.b >= 0 || this.f168a.f248a) {
            return;
        }
        this.f165a.a(r4);
    }

    @Override // defpackage.du
    public final void a(fe feVar) {
        cr crVar = this.f167a;
        cr.a(feVar);
    }

    @Override // defpackage.du
    public final void b(fe feVar) {
        cr crVar = this.f167a;
        feVar.a(cr.a(feVar, false));
    }
}
