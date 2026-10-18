package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:en.class */
public final class en extends eo {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap[] f322a;
    public final ap[] b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f323a;
    public final ap a = new ap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final ap f324b = new ap();
    private final ap c = new ap();
    private final ap d = new ap();
    private final ap e = new ap();

    public en() {
        new ap();
        new ap();
        new es();
        ((eo) this).b = 1;
        this.f323a = 0;
        this.f322a = new ap[8];
        for (int r6 = 0; r6 < this.f322a.length; r6++) {
            this.f322a[r6] = new ap();
        }
        this.b = new ap[8];
        for (int r7 = 0; r7 < this.b.length; r7++) {
            this.b[r7] = new ap();
        }
        ((eo) this).a = eq.b;
        this.a.m21a();
    }

    @Override // defpackage.eo
    public final eo a() {
        en enVar = new en();
        enVar.a.a(this.a);
        for (int r6 = 0; r6 < enVar.b.length; r6++) {
            enVar.b[r6].a(this.b[r6]);
            enVar.f322a[r6].a(this.f322a[r6]);
        }
        ((eo) enVar).a = ((eo) this).a;
        enVar.f323a = this.f323a;
        return enVar;
    }

    public final void a(ap[] apVarArr, int r7) {
        this.f323a = r7;
        for (int r8 = 0; r8 < this.f323a; r8++) {
            this.f322a[r8] = apVarArr[r8];
        }
        ap apVar = this.f324b;
        for (int r6 = 0; r6 < this.f323a; r6++) {
            apVar.b(this.f322a[r6 + 1 < this.f323a ? r6 + 1 : 0], this.f322a[r6]);
            this.b[r6].b(apVar, 1.0f);
            this.b[r6].m27a();
        }
        ap[] apVarArr2 = this.f322a;
        int r2 = this.f323a;
        ap apVar2 = this.a;
        apVar2.a(0.0f);
        float f = 0.0f;
        if (r2 == 2) {
            apVar2.m22a(apVarArr2[0]).m24b(apVarArr2[1]).m26a(0.5f);
            return;
        }
        ap apVar3 = this.f324b;
        apVar3.m21a();
        ap apVar4 = this.c;
        ap apVar5 = this.d;
        for (int r13 = 0; r13 < r2; r13++) {
            ap apVar6 = apVarArr2[r13];
            ap apVar7 = r13 + 1 < r2 ? apVarArr2[r13 + 1] : apVarArr2[0];
            apVar4.b(apVar6, apVar3);
            apVar5.b(apVar7, apVar3);
            float fM32b = 0.5f * ap.m32b(apVar4, apVar5);
            f += fM32b;
            apVar2.m24b(apVar3).m24b(apVar6).m24b(apVar7).b(fM32b * 0.33333334f);
        }
        apVar2.b(1.0f / f);
    }

    @Override // defpackage.eo
    public final void a(dx dxVar, es esVar) {
        ap apVar = this.f324b;
        ap apVar2 = this.c;
        ap apVar3 = this.d;
        es.a(esVar, this.f322a[0], apVar);
        apVar2.a(apVar);
        for (int r10 = 1; r10 < this.f323a; r10++) {
            es.a(esVar, this.f322a[r10], apVar3);
            apVar.c(apVar, apVar3);
            apVar2.d(apVar2, apVar3);
        }
        dxVar.a.f60a = apVar.f60a - ((eo) this).a;
        dxVar.a.b = apVar.b - ((eo) this).a;
        dxVar.b.f60a = apVar2.f60a + ((eo) this).a;
        dxVar.b.b = apVar2.b + ((eo) this).a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m166a() {
        return this.f323a;
    }

    @Override // defpackage.eo
    public final void a(em emVar, float f) {
        if (this.f323a == 2) {
            emVar.f321a.m22a(this.f322a[0]).m24b(this.f322a[1]).m26a(0.5f);
            emVar.a = 0.0f;
            emVar.b = 0.0f;
            return;
        }
        ap apVar = this.f324b;
        apVar.m21a();
        float f2 = 0.0f;
        float f3 = 0.0f;
        ap apVar2 = this.c;
        apVar2.m21a();
        ap apVar3 = this.d;
        ap apVar4 = this.e;
        for (int r15 = 0; r15 < this.f323a; r15++) {
            ap apVar5 = this.f322a[r15];
            ap apVar6 = r15 + 1 < this.f323a ? this.f322a[r15 + 1] : this.f322a[0];
            apVar3.b(apVar5, apVar2);
            apVar4.b(apVar6, apVar2);
            float fM32b = ap.m32b(apVar3, apVar4);
            float f4 = 0.5f * fM32b;
            f2 += f4;
            apVar.f60a += f4 * 0.33333334f * (apVar2.f60a + apVar5.f60a + apVar6.f60a);
            apVar.b += f4 * 0.33333334f * (apVar2.b + apVar5.b + apVar6.b);
            float f5 = apVar2.f60a;
            float f6 = apVar2.b;
            float f7 = apVar3.f60a;
            float f8 = apVar3.b;
            float f9 = apVar4.f60a;
            float f10 = apVar4.b;
            f3 += fM32b * ((0.33333334f * ((0.25f * ((f7 * f7) + (f9 * f7) + (f9 * f9))) + (f5 * f7) + (f5 * f9))) + (0.5f * f5 * f5) + (0.33333334f * ((0.25f * ((f8 * f8) + (f10 * f8) + (f10 * f10))) + (f6 * f8) + (f6 * f10))) + (0.5f * f6 * f6));
        }
        emVar.a = f * f2;
        apVar.b(1.0f / f2);
        emVar.f321a.a(apVar);
        emVar.b = f3 * f;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final ap[] m167a() {
        return this.f322a;
    }
}
