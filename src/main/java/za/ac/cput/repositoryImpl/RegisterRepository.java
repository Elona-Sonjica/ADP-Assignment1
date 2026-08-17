package za.ac.cput.repositoryImpl;

import za.ac.cput.Domain.Register;
import za.ac.cput.Repository.IRegisterRepository;

import java.util.*;

public class RegisterRepository implements IRegisterRepository {


    private static RegisterRepository repository = null;
    private final List<Register> allRegisters;

    private RegisterRepository() {
        allRegisters = new ArrayList<>();
    }

    public static RegisterRepository getRepository() {
        if (repository == null) {
            repository = new RegisterRepository();
        }
        return repository;
    }

    @Override
    public Register create(Register register) {
        allRegisters.add(register);
        return register;
    }

    @Override
    public Register read(String registerId) {
        for (Register register : allRegisters) {
            if (register.getRegisterId().equals(registerId)) {
                return register;
            }
        }
        return null;
    }

    @Override
    public Register update(Register register) {
        Register existingRegister = read(register.getRegisterId());

        if (existingRegister != null) {
            allRegisters.remove(existingRegister);
            allRegisters.add(register);
            return register;
        }

        return null;
    }

    @Override
    public boolean delete(String registerId) {
        Register registerToDelete = read(registerId);

        if (registerToDelete != null) {
            allRegisters.remove(registerToDelete);
            return true;
        }

        return false;
    }

}
